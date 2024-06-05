package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Function: ImageVector
    get() {
        if (_function != null) {
            return _function!!
        }
        _function = Builder(name = "Function", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 12.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.627f)
                lineToRelative(-0.91f, 6.675f)
                curveToRelative(-0.336f, 2.466f, -2.465f, 4.325f, -4.954f, 4.325f)
                horizontalLineToRelative(-0.508f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.508f)
                curveToRelative(1.493f, 0.0f, 2.771f, -1.115f, 2.973f, -2.595f)
                lineToRelative(0.874f, -6.405f)
                horizontalLineToRelative(-1.354f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.627f)
                lineToRelative(0.91f, -6.675f)
                curveToRelative(0.336f, -2.466f, 2.465f, -4.325f, 4.954f, -4.325f)
                horizontalLineToRelative(0.508f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-0.508f)
                curveToRelative(-1.493f, 0.0f, -2.771f, 1.115f, -2.973f, 2.595f)
                lineToRelative(-0.874f, 6.405f)
                horizontalLineToRelative(1.354f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(18.229f, 19.5f)
                lineToRelative(2.085f, -2.919f)
                curveToRelative(0.321f, -0.449f, 0.217f, -1.074f, -0.233f, -1.395f)
                curveToRelative(-0.45f, -0.322f, -1.074f, -0.218f, -1.395f, 0.232f)
                lineToRelative(-1.686f, 2.36f)
                lineToRelative(-1.686f, -2.36f)
                curveToRelative(-0.321f, -0.45f, -0.947f, -0.555f, -1.395f, -0.232f)
                curveToRelative(-0.45f, 0.32f, -0.554f, 0.945f, -0.233f, 1.395f)
                lineToRelative(2.085f, 2.919f)
                lineToRelative(-2.085f, 2.919f)
                curveToRelative(-0.321f, 0.449f, -0.217f, 1.074f, 0.233f, 1.395f)
                curveToRelative(0.176f, 0.126f, 0.379f, 0.187f, 0.58f, 0.187f)
                curveToRelative(0.312f, 0.0f, 0.62f, -0.146f, 0.815f, -0.419f)
                lineToRelative(1.686f, -2.36f)
                lineToRelative(1.686f, 2.36f)
                curveToRelative(0.195f, 0.273f, 0.503f, 0.419f, 0.815f, 0.419f)
                curveToRelative(0.201f, 0.0f, 0.404f, -0.061f, 0.58f, -0.187f)
                curveToRelative(0.45f, -0.32f, 0.554f, -0.945f, 0.233f, -1.395f)
                lineToRelative(-2.085f, -2.919f)
                close()
            }
        }
        .build()
        return _function!!
    }

private var _function: ImageVector? = null
