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

public val Icons.Outline.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.913f, 0.049f)
                curveTo(22.357f, 0.075f, 9.262f, 0.72f, 4.862f, 5.12f)
                arcTo(9.931f, 9.931f, 0.0f, false, false, 4.191f, 18.4f)
                lineTo(0.0f, 22.591f)
                lineTo(1.415f, 24.0f)
                lineToRelative(4.19f, -4.184f)
                arcToRelative(9.93f, 9.93f, 0.0f, false, false, 13.281f, -0.672f)
                curveToRelative(4.488f, -4.487f, 5.05f, -17.5f, 5.071f, -18.056f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(17.472f, 17.73f)
                arcToRelative(7.929f, 7.929f, 0.0f, false, true, -10.444f, 0.662f)
                lineToRelative(9.637f, -9.637f)
                lineTo(15.251f, 7.341f)
                lineTo(5.614f, 16.978f)
                arcTo(7.929f, 7.929f, 0.0f, false, true, 6.276f, 6.534f)
                curveTo(9.455f, 3.355f, 18.683f, 2.372f, 21.891f, 2.122f)
                curveTo(21.657f, 5.315f, 20.716f, 14.486f, 17.472f, 17.73f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
