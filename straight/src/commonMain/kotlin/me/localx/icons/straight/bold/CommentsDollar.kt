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

public val Icons.Bold.CommentsDollar: ImageVector
    get() {
        if (_commentsDollar != null) {
            return _commentsDollar!!
        }
        _commentsDollar = Builder(name = "CommentsDollar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 0.0f)
                curveTo(4.038f, 0.0f, 0.0f, 4.038f, 0.0f, 9.0f)
                verticalLineToRelative(9.0f)
                lineTo(9.0f, 18.0f)
                curveToRelative(4.962f, 0.0f, 9.0f, -4.037f, 9.0f, -9.0f)
                reflectiveCurveTo(13.962f, 0.0f, 9.0f, 0.0f)
                close()
                moveTo(13.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                curveToRelative(0.0f, 0.294f, 0.177f, 0.555f, 0.45f, 0.665f)
                lineToRelative(2.215f, 0.886f)
                curveToRelative(1.419f, 0.567f, 2.335f, 1.922f, 2.335f, 3.45f)
                curveToRelative(0.0f, 1.58f, -1.059f, 2.903f, -2.5f, 3.337f)
                verticalLineToRelative(1.163f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.163f)
                curveToRelative(-1.441f, -0.434f, -2.5f, -1.757f, -2.5f, -3.337f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                curveToRelative(0.0f, -0.294f, -0.177f, -0.555f, -0.45f, -0.665f)
                lineToRelative(-2.215f, -0.886f)
                curveToRelative(-1.419f, -0.567f, -2.335f, -1.922f, -2.335f, -3.45f)
                curveToRelative(0.0f, -1.58f, 1.059f, -2.903f, 2.5f, -3.337f)
                verticalLineToRelative(-1.163f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.163f)
                curveToRelative(1.441f, 0.434f, 2.5f, 1.757f, 2.5f, 3.337f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-2.955f, 0.0f, -5.535f, -1.615f, -6.92f, -4.004f)
                curveToRelative(1.159f, -0.008f, 2.274f, -0.199f, 3.322f, -0.54f)
                curveToRelative(0.91f, 0.948f, 2.184f, 1.544f, 3.598f, 1.544f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.415f, -0.597f, -2.688f, -1.544f, -3.598f)
                curveToRelative(0.342f, -1.048f, 0.532f, -2.163f, 0.54f, -3.322f)
                curveToRelative(2.389f, 1.385f, 4.004f, 3.965f, 4.004f, 6.92f)
                close()
            }
        }
        .build()
        return _commentsDollar!!
    }

private var _commentsDollar: ImageVector? = null
