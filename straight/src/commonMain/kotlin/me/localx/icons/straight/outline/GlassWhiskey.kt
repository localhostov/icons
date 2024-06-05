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

public val Icons.Outline.GlassWhiskey: ImageVector
    get() {
        if (_glassWhiskey != null) {
            return _glassWhiskey!!
        }
        _glassWhiskey = Builder(name = "GlassWhiskey", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.018f, 1.0f)
                lineToRelative(1.799f, 19.279f)
                curveToRelative(0.145f, 1.551f, 1.429f, 2.721f, 2.987f, 2.721f)
                horizontalLineToRelative(14.271f)
                curveToRelative(1.549f, 0.0f, 2.832f, -1.162f, 2.985f, -2.701f)
                lineToRelative(1.931f, -19.299f)
                lineTo(0.018f, 1.0f)
                close()
                moveTo(19.075f, 21.0f)
                lineTo(4.804f, 21.0f)
                curveToRelative(-0.52f, 0.0f, -0.947f, -0.39f, -0.995f, -0.907f)
                lineToRelative(-0.382f, -4.093f)
                horizontalLineToRelative(17.053f)
                lineToRelative(-0.41f, 4.1f)
                curveToRelative(-0.051f, 0.513f, -0.479f, 0.9f, -0.995f, 0.9f)
                close()
                moveTo(20.68f, 14.0f)
                lineTo(3.24f, 14.0f)
                lineTo(2.213f, 3.0f)
                horizontalLineToRelative(19.566f)
                lineToRelative(-1.1f, 11.0f)
                close()
            }
        }
        .build()
        return _glassWhiskey!!
    }

private var _glassWhiskey: ImageVector? = null
