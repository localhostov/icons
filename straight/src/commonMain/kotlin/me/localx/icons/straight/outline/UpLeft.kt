package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.UpLeft: ImageVector
    get() {
        if (_upLeft != null) {
            return _upLeft!!
        }
        _upLeft = Builder(name = "UpLeft", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.17f, 23.24f)
                lineTo(5.97f, 13.05f)
                lineTo(1.0f, 17.97f)
                verticalLineTo(4.01f)
                curveToRelative(0.0f, -0.8f, 0.32f, -1.56f, 0.88f, -2.13f)
                curveToRelative(0.57f, -0.57f, 1.32f, -0.88f, 2.12f, -0.88f)
                horizontalLineToRelative(13.98f)
                reflectiveCurveToRelative(-4.94f, 4.97f, -4.94f, 4.97f)
                lineToRelative(10.19f, 10.19f)
                lineToRelative(-7.07f, 7.07f)
                close()
                moveTo(5.98f, 10.22f)
                lineToRelative(10.19f, 10.19f)
                lineToRelative(4.24f, -4.24f)
                lineTo(10.22f, 5.98f)
                lineToRelative(2.96f, -2.98f)
                horizontalLineTo(4.01f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-0.27f, 0.0f, -0.52f, 0.1f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.29f, 0.44f, -0.29f, 0.71f)
                verticalLineTo(13.17f)
                reflectiveCurveToRelative(2.97f, -2.95f, 2.97f, -2.95f)
                close()
            }
        }
        .build()
        return _upLeft!!
    }

private var _upLeft: ImageVector? = null
