package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.414f, 7.9f)
                verticalLineTo(9.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.707f, 0.707f)
                lineToRelative(3.586f, -3.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                lineTo(20.121f, 1.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.707f, 0.707f)
                verticalLineToRelative(2.4f)
                curveToRelative(-3.35f, 0.732f, -5.6f, 2.781f, -7.51f, 4.911f)
                curveTo(8.718f, 7.316f, 6.08f, 5.021f, 1.83f, 4.586f)
                curveToRelative(-0.046f, -0.01f, -0.311f, -0.039f, -0.33f, -0.039f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.131f, 2.994f)
                horizontalLineToRelative(0.0f)
                curveToRelative(3.464f, 0.3f, 5.5f, 2.159f, 7.549f, 4.458f)
                curveToRelative(-2.046f, 2.3f, -4.087f, 4.166f, -7.552f, 4.462f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 19.453f)
                curveToRelative(0.038f, 0.0f, 0.073f, 0.0f, 0.111f, -0.008f)
                horizontalLineToRelative(0.0f)
                curveTo(6.84f, 19.0f, 9.649f, 15.753f, 12.148f, 12.86f)
                curveTo(14.059f, 10.65f, 15.792f, 8.7f, 18.414f, 7.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.121f, 13.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.707f, 0.707f)
                verticalLineToRelative(1.7f)
                arcToRelative(9.186f, 9.186f, 0.0f, false, true, -3.452f, -2.0f)
                arcToRelative(1.466f, 1.466f, 0.0f, false, false, -2.062f, 0.157f)
                lineToRelative(-0.025f, 0.028f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, false, 0.165f, 2.111f)
                arcTo(11.977f, 11.977f, 0.0f, false, false, 18.414f, 19.2f)
                verticalLineToRelative(2.391f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.707f, 0.707f)
                lineToRelative(3.586f, -3.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                close()
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
