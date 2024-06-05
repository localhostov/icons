package me.localx.icons.rounded.bold

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

public val Icons.Bold.BookArrowRight: ImageVector
    get() {
        if (_bookArrowRight != null) {
            return _bookArrowRight!!
        }
        _bookArrowRight = Builder(name = "BookArrowRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.663f)
                verticalLineToRelative(-1.663f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.972f, -0.034f, -1.971f, -2.966f, 0.0f, -3.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1.663f)
                curveToRelative(0.0f, -0.891f, 1.077f, -1.337f, 1.707f, -0.707f)
                lineToRelative(3.163f, 3.163f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.024f, 0.0f, 1.414f)
                lineToRelative(-3.163f, 3.163f)
                curveToRelative(-0.63f, 0.63f, -1.707f, 0.184f, -1.707f, -0.707f)
                close()
                moveTo(23.0f, 16.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-2.378f, 0.0f, -4.341f, -1.859f, -4.5f, -4.197f)
                lineTo(1.0f, 5.5f)
                curveTo(1.0f, 2.462f, 3.462f, 0.0f, 6.5f, 0.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.966f, 0.0f, 3.783f, 1.052f, 4.765f, 2.753f)
                curveToRelative(0.361f, 0.625f, 0.277f, 1.455f, -0.266f, 1.93f)
                curveToRelative(-0.756f, 0.661f, -1.883f, 0.422f, -2.327f, -0.423f)
                curveToRelative(-0.435f, -0.828f, -1.38f, -1.26f, -2.316f, -1.26f)
                horizontalLineToRelative(-7.356f)
                lineTo(10.0f, 15.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(4.0f, 5.5f)
                lineTo(4.0f, 15.276f)
                curveToRelative(0.471f, -0.168f, 0.971f, -0.276f, 1.5f, -0.276f)
                horizontalLineToRelative(1.5f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                close()
                moveTo(20.0f, 18.0f)
                lineTo(5.5f, 18.0f)
                curveToRelative(-1.972f, 0.035f, -1.97f, 2.965f, 0.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }
        .build()
        return _bookArrowRight!!
    }

private var _bookArrowRight: ImageVector? = null
