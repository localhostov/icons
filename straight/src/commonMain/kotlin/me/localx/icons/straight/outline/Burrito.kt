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

public val Icons.Outline.Burrito: ImageVector
    get() {
        if (_burrito != null) {
            return _burrito!!
        }
        _burrito = Builder(name = "Burrito", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.137f, -2.776f)
                arcTo(4.07f, 4.07f, 0.0f, false, false, 12.0f, 0.545f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, false, -4.863f, 0.679f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 4.0f)
                arcTo(3.7f, 3.7f, 0.0f, false, false, 4.0f, 6.479f)
                lineTo(4.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(17.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(20.0f, 6.479f)
                arcTo(3.7f, 3.7f, 0.0f, false, false, 21.0f, 4.0f)
                close()
                moveTo(6.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.69f, 0.281f)
                lineToRelative(0.939f, 0.9f)
                lineToRelative(0.63f, -1.142f)
                arcToRelative(1.969f, 1.969f, 0.0f, false, true, 3.072f, -0.522f)
                lineToRelative(0.669f, 0.6f)
                lineToRelative(0.669f, -0.6f)
                arcToRelative(1.969f, 1.969f, 0.0f, false, true, 3.072f, 0.522f)
                lineToRelative(0.63f, 1.142f)
                lineToRelative(0.939f, -0.9f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 4.0f)
                arcToRelative(1.758f, 1.758f, 0.0f, false, true, -0.362f, 1.009f)
                arcToRelative(9.546f, 9.546f, 0.0f, false, false, -6.259f, 3.034f)
                curveToRelative(-0.457f, -0.334f, -0.92f, -0.645f, -1.382f, -0.93f)
                arcToRelative(7.605f, 7.605f, 0.0f, false, true, 1.547f, -1.4f)
                lineTo(11.456f, 4.031f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, false, -2.25f, 2.1f)
                arcTo(10.953f, 10.953f, 0.0f, false, false, 5.365f, 5.012f)
                arcTo(1.754f, 1.754f, 0.0f, false, true, 5.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 3.0f)
                close()
                moveTo(17.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(6.0f, 7.107f)
                curveToRelative(4.432f, 0.88f, 12.0f, 7.064f, 12.0f, 13.893f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 22.0f)
                close()
                moveTo(18.0f, 14.145f)
                arcTo(20.23f, 20.23f, 0.0f, false, false, 13.945f, 9.3f)
                arcTo(7.79f, 7.79f, 0.0f, false, true, 18.0f, 7.088f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 16.0f)
                close()
                moveTo(10.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 19.0f)
                close()
                moveTo(13.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 18.0f)
                close()
            }
        }
        .build()
        return _burrito!!
    }

private var _burrito: ImageVector? = null
