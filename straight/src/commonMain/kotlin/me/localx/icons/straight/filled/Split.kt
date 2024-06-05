package me.localx.icons.straight.filled

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

public val Icons.Filled.Split: ImageVector
    get() {
        if (_split != null) {
            return _split!!
        }
        _split = Builder(name = "Split", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.86f, 14.03f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.55f, 2.55f)
                horizontalLineToRelative(-7.08f)
                curveToRelative(-0.29f, 0.0f, -0.57f, -0.13f, -0.76f, -0.35f)
                lineToRelative(-4.84f, -5.65f)
                lineToRelative(4.84f, -5.65f)
                curveToRelative(0.19f, -0.22f, 0.47f, -0.35f, 0.76f, -0.35f)
                horizontalLineToRelative(7.08f)
                lineToRelative(-2.55f, 2.55f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.55f, -3.55f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f)
                lineTo(19.86f, 0.03f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.55f, 2.55f)
                horizontalLineToRelative(-7.08f)
                curveToRelative(-0.88f, 0.0f, -1.71f, 0.38f, -2.28f, 1.05f)
                lineToRelative(-5.1f, 5.95f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.54f)
                lineToRelative(5.1f, 5.95f)
                curveToRelative(0.57f, 0.67f, 1.4f, 1.05f, 2.28f, 1.05f)
                horizontalLineToRelative(7.08f)
                lineToRelative(-2.55f, 2.55f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.55f, -3.55f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f)
                lineToRelative(-3.55f, -3.55f)
                close()
            }
        }
        .build()
        return _split!!
    }

private var _split: ImageVector? = null
