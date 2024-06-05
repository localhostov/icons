package me.localx.icons.straight.bold

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

public val Icons.Bold.Left: ImageVector
    get() {
        if (_left != null) {
            return _left!!
        }
        _left = Builder(name = "Left", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 24.04f)
                lineTo(0.98f, 14.35f)
                curveTo(0.34f, 13.71f, 0.0f, 12.88f, 0.0f, 12.0f)
                curveToRelative(0.0f, -0.88f, 0.35f, -1.71f, 0.97f, -2.33f)
                horizontalLineToRelative(0.02f)
                reflectiveCurveTo(11.0f, -0.01f, 11.0f, -0.01f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(7.04f)
                close()
                moveTo(3.08f, 11.8f)
                curveToRelative(-0.07f, 0.07f, -0.08f, 0.15f, -0.08f, 0.2f)
                reflectiveCurveToRelative(0.01f, 0.14f, 0.09f, 0.21f)
                lineToRelative(4.91f, 4.75f)
                verticalLineToRelative(-2.96f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-2.95f)
                lineTo(3.08f, 11.8f)
                close()
            }
        }
        .build()
        return _left!!
    }

private var _left: ImageVector? = null
