package me.localx.icons.rounded.outline

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
                moveTo(23.733f, 12.654f)
                arcToRelative(3.971f, 3.971f, 0.0f, false, true, -2.108f, 2.22f)
                lineToRelative(-19.2f, 9.031f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.852f, -1.81f)
                lineToRelative(12.514f, -5.886f)
                lineTo(12.813f, 13.54f)
                lineToRelative(-2.62f, 1.191f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.9f, -1.35f)
                lineTo(4.918f, 10.0f)
                arcToRelative(2.965f, 2.965f, 0.0f, false, true, 5.307f, -2.645f)
                lineToRelative(1.131f, 2.518f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.824f, 0.819f)
                lineTo(8.425f, 8.224f)
                arcTo(0.944f, 0.944f, 0.0f, false, false, 7.88f, 7.8f)
                arcToRelative(0.959f, 0.959f, 0.0f, false, false, -0.74f, 0.068f)
                arcToRelative(0.969f, 0.969f, 0.0f, false, false, -0.407f, 1.3f)
                lineTo(8.1f, 12.546f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, 1.262f, 0.364f)
                lineToRelative(2.619f, -1.191f)
                arcToRelative(2.009f, 2.009f, 0.0f, false, true, 2.633f, 0.96f)
                lineToRelative(1.28f, 2.679f)
                lineToRelative(4.895f, -2.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.034f, -2.649f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.826f, -0.814f)
                arcTo(3.973f, 3.973f, 0.0f, false, true, 23.733f, 12.654f)
                close()
                moveTo(2.738f, 15.142f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 3.709f, 3.317f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.719f, -1.866f)
                arcTo(4.991f, 4.991f, 0.0f, false, true, 4.532f, 14.26f)
                lineTo(1.924f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.848f, 0.767f)
                close()
                moveTo(14.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 10.0f)
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
