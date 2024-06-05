package me.localx.icons.rounded.filled

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

public val Icons.Filled.Bullseye: ImageVector
    get() {
        if (_bullseye != null) {
            return _bullseye!!
        }
        _bullseye = Builder(name = "Bullseye", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                curveToRelative(0.603f, -15.898f, 23.399f, -15.893f, 24.0f, 0.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.503f, 13.248f, 19.499f, 13.245f, 20.0f, 0.0f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                curveToRelative(0.376f, -10.588f, 15.626f, -10.585f, 16.0f, 0.0f)
                curveToRelative(0.0f, 4.411f, -3.589f, 8.0f, -8.0f, 8.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(-7.929f, 0.252f, -7.928f, 11.749f, 0.0f, 12.0f)
                curveToRelative(7.929f, -0.252f, 7.927f, -11.749f, 0.0f, -12.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-5.274f, -0.139f, -5.273f, -7.862f, 0.0f, -8.0f)
                curveToRelative(5.274f, 0.139f, 5.273f, 7.862f, 0.0f, 8.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(-2.628f, 0.047f, -2.628f, 3.954f, 0.0f, 4.0f)
                curveToRelative(2.628f, -0.047f, 2.628f, -3.954f, 0.0f, -4.0f)
                close()
            }
        }
        .build()
        return _bullseye!!
    }

private var _bullseye: ImageVector? = null
