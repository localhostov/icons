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

public val Icons.Filled.XRay: ImageVector
    get() {
        if (_xRay != null) {
            return _xRay!!
        }
        _xRay = Builder(name = "XRay", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 2.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(20.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.399f)
                curveToRelative(1.096f, 0.017f, 1.995f, 0.643f, 2.396f, 1.633f)
                curveToRelative(0.418f, 1.031f, 0.187f, 2.199f, -0.59f, 2.976f)
                lineToRelative(-1.392f, 1.392f)
                horizontalLineToRelative(-7.627f)
                lineToRelative(-1.392f, -1.392f)
                curveToRelative(-0.776f, -0.776f, -1.008f, -1.944f, -0.59f, -2.976f)
                curveToRelative(0.4f, -0.99f, 1.3f, -1.616f, 2.346f, -1.633f)
                horizontalLineToRelative(2.449f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.601f, 16.0f)
                horizontalLineToRelative(6.815f)
                curveToRelative(0.324f, 0.005f, 0.468f, 0.242f, 0.525f, 0.383f)
                curveToRelative(0.092f, 0.228f, 0.101f, 0.561f, -0.15f, 0.812f)
                lineToRelative(-0.806f, 0.806f)
                horizontalLineToRelative(-5.971f)
                lineToRelative(-0.806f, -0.806f)
                curveToRelative(-0.251f, -0.251f, -0.242f, -0.584f, -0.15f, -0.812f)
                curveToRelative(0.058f, -0.141f, 0.201f, -0.378f, 0.542f, -0.383f)
                close()
            }
        }
        .build()
        return _xRay!!
    }

private var _xRay: ImageVector? = null
