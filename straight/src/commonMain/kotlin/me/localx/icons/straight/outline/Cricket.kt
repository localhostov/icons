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

public val Icons.Outline.Cricket: ImageVector
    get() {
        if (_cricket != null) {
            return _cricket!!
        }
        _cricket = Builder(name = "Cricket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.807f, 11.346f)
                arcToRelative(2.65f, 2.65f, 0.0f, false, true, 0.0f, -3.739f)
                lineToRelative(0.0f, 0.0f)
                lineTo(21.5f, 3.914f)
                lineToRelative(1.043f, 1.043f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(19.043f, 1.457f)
                lineTo(20.086f, 2.5f)
                lineTo(16.4f, 6.189f)
                arcToRelative(2.652f, 2.652f, 0.0f, false, true, -3.742f, 0.0f)
                lineToRelative(-0.707f, -0.7f)
                lineTo(0.341f, 17.1f)
                lineToRelative(-0.074f, 0.223f)
                curveToRelative(-0.044f, 0.13f, -1.031f, 3.186f, 1.1f, 5.316f)
                arcTo(4.811f, 4.811f, 0.0f, false, false, 4.858f, 24.0f)
                arcToRelative(6.241f, 6.241f, 0.0f, false, false, 1.824f, -0.266f)
                lineToRelative(0.223f, -0.074f)
                lineTo(18.512f, 12.053f)
                close()
                moveTo(5.848f, 21.889f)
                arcTo(3.371f, 3.371f, 0.0f, false, true, 2.78f, 21.22f)
                arcToRelative(3.37f, 3.37f, 0.0f, false, true, -0.669f, -3.068f)
                lineToRelative(7.627f, -7.627f)
                arcTo(2.57f, 2.57f, 0.0f, false, true, 10.0f, 11.673f)
                lineTo(10.0f, 14.0f)
                horizontalLineToRelative(2.413f)
                arcToRelative(2.393f, 2.393f, 0.0f, false, true, 1.063f, 0.26f)
                close()
                moveTo(14.919f, 12.817f)
                arcToRelative(4.263f, 4.263f, 0.0f, false, false, -2.5f, -0.817f)
                lineTo(12.0f, 12.0f)
                verticalLineToRelative(-0.327f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -0.818f, -2.592f)
                lineToRelative(0.843f, -0.843f)
                arcToRelative(4.682f, 4.682f, 0.0f, false, false, 3.044f, 0.693f)
                arcToRelative(4.656f, 4.656f, 0.0f, false, false, 0.693f, 3.043f)
                close()
                moveTo(20.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 24.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 17.0f)
                close()
                moveTo(20.5f, 22.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 22.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 22.0f)
                close()
            }
        }
        .build()
        return _cricket!!
    }

private var _cricket: ImageVector? = null
