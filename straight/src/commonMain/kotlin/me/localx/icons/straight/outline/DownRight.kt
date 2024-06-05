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

public val Icons.Outline.DownRight: ImageVector
    get() {
        if (_downRight != null) {
            return _downRight!!
        }
        _downRight = Builder(name = "DownRight", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.02f, 23.01f)
                lineToRelative(4.94f, -4.98f)
                lineTo(0.77f, 7.84f)
                lineTo(7.84f, 0.77f)
                lineToRelative(10.2f, 10.2f)
                lineToRelative(4.97f, -4.92f)
                verticalLineToRelative(13.96f)
                curveToRelative(0.0f, 0.8f, -0.32f, 1.56f, -0.88f, 2.12f)
                curveToRelative(-0.57f, 0.57f, -1.32f, 0.88f, -2.12f, 0.88f)
                horizontalLineTo(6.02f)
                close()
                moveTo(3.6f, 7.84f)
                lineToRelative(10.19f, 10.19f)
                lineToRelative(-2.96f, 2.98f)
                horizontalLineToRelative(9.17f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.27f, 0.0f, 0.52f, -0.1f, 0.71f, -0.29f)
                reflectiveCurveToRelative(0.29f, -0.44f, 0.29f, -0.71f)
                verticalLineTo(10.84f)
                reflectiveCurveToRelative(-2.97f, 2.95f, -2.97f, 2.95f)
                lineTo(7.84f, 3.6f)
                lineTo(3.6f, 7.84f)
                close()
            }
        }
        .build()
        return _downRight!!
    }

private var _downRight: ImageVector? = null
