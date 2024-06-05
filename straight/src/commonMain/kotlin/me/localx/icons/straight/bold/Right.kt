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

public val Icons.Bold.Right: ImageVector
    get() {
        if (_right != null) {
            return _right!!
        }
        _right = Builder(name = "Right", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 24.04f)
                verticalLineToRelative(-7.04f)
                horizontalLineTo(0.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(-0.01f)
                lineToRelative(10.03f, 9.68f)
                curveToRelative(0.63f, 0.62f, 0.97f, 1.45f, 0.97f, 2.33f)
                curveToRelative(0.0f, 0.88f, -0.34f, 1.71f, -0.97f, 2.33f)
                lineToRelative(-10.03f, 9.7f)
                close()
                moveTo(3.0f, 14.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(2.96f)
                lineToRelative(4.93f, -4.77f)
                curveToRelative(0.06f, -0.06f, 0.07f, -0.14f, 0.07f, -0.19f)
                reflectiveCurveToRelative(-0.01f, -0.13f, -0.08f, -0.2f)
                lineToRelative(-4.92f, -4.75f)
                verticalLineToRelative(2.95f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _right!!
    }

private var _right: ImageVector? = null
