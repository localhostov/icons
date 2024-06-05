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

public val Icons.Bold.Bullseye: ImageVector
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
                moveTo(12.0f, 3.0f)
                curveTo(7.038f, 3.0f, 3.0f, 7.038f, 3.0f, 12.0f)
                curveToRelative(0.453f, 11.923f, 17.549f, 11.92f, 18.0f, 0.0f)
                curveToRelative(0.0f, -4.962f, -4.038f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-9.251f, -0.294f, -9.249f, -13.707f, 0.0f, -14.0f)
                curveToRelative(9.251f, 0.294f, 9.249f, 13.707f, 0.0f, 14.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(-5.274f, 0.139f, -5.273f, 7.862f, 0.0f, 8.0f)
                curveToRelative(5.274f, -0.139f, 5.273f, -7.862f, 0.0f, -8.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-2.628f, -0.047f, -2.628f, -3.954f, 0.0f, -4.0f)
                curveToRelative(2.628f, 0.047f, 2.628f, 3.954f, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bullseye!!
    }

private var _bullseye: ImageVector? = null
