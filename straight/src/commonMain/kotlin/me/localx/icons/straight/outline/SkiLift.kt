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

public val Icons.Outline.SkiLift: ImageVector
    get() {
        if (_skiLift != null) {
            return _skiLift!!
        }
        _skiLift = Builder(name = "SkiLift", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.733f, 12.956f)
                arcToRelative(3.971f, 3.971f, 0.0f, false, true, -2.108f, 2.22f)
                lineToRelative(-18.8f, 8.46f)
                lineTo(2.0f, 21.812f)
                lineToRelative(12.15f, -5.467f)
                lineToRelative(-1.346f, -2.822f)
                lineToRelative(-2.63f, 1.138f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.289f, 13.3f)
                lineToRelative(-1.367f, -3.3f)
                arcToRelative(2.965f, 2.965f, 0.0f, false, true, 5.3f, -2.652f)
                lineToRelative(1.131f, 2.518f)
                lineToRelative(-1.824f, 0.819f)
                lineTo(8.425f, 8.224f)
                arcTo(0.944f, 0.944f, 0.0f, false, false, 7.88f, 7.8f)
                arcToRelative(0.959f, 0.959f, 0.0f, false, false, -0.74f, 0.068f)
                arcToRelative(0.969f, 0.969f, 0.0f, false, false, -0.407f, 1.3f)
                lineTo(8.1f, 12.46f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, false, 1.265f, 0.372f)
                lineToRelative(4.414f, -1.909f)
                lineToRelative(2.2f, 4.6f)
                lineToRelative(4.832f, -2.174f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.017f, -2.642f)
                lineTo(23.654f, 9.9f)
                arcTo(3.977f, 3.977f, 0.0f, false, true, 23.733f, 12.956f)
                close()
                moveTo(2.738f, 15.142f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 3.709f, 3.317f)
                lineToRelative(0.719f, -1.866f)
                arcTo(4.991f, 4.991f, 0.0f, false, true, 4.532f, 14.26f)
                lineTo(1.924f, 8.0f)
                lineTo(0.076f, 8.765f)
                close()
                moveTo(15.0f, 0.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(5.5f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 5.0f)
                close()
            }
        }
        .build()
        return _skiLift!!
    }

private var _skiLift: ImageVector? = null
