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

public val Icons.Outline.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.0f)
                horizontalLineTo(18.92f)
                arcToRelative(6.924f, 6.924f, 0.0f, false, false, -0.429f, -1.607f)
                lineToRelative(3.527f, -2.044f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, -1.731f)
                lineToRelative(-3.53f, 2.047f)
                arcToRelative(7.062f, 7.062f, 0.0f, false, false, -1.149f, -1.15f)
                lineToRelative(2.046f, -3.531f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.731f, -1.0f)
                lineTo(14.607f, 5.509f)
                arcTo(6.9f, 6.9f, 0.0f, false, false, 13.0f, 5.08f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(5.08f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, -1.607f, 0.429f)
                lineTo(7.349f, 1.982f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.731f, 1.0f)
                lineTo(7.664f, 6.515f)
                arcToRelative(7.062f, 7.062f, 0.0f, false, false, -1.149f, 1.15f)
                lineTo(2.985f, 5.618f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 1.731f)
                lineTo(5.509f, 9.393f)
                arcTo(6.924f, 6.924f, 0.0f, false, false, 5.08f, 11.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(5.08f)
                arcToRelative(6.924f, 6.924f, 0.0f, false, false, 0.429f, 1.607f)
                lineTo(1.982f, 16.651f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.731f)
                lineToRelative(3.53f, -2.047f)
                arcToRelative(7.062f, 7.062f, 0.0f, false, false, 1.149f, 1.15f)
                lineTo(5.618f, 21.016f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.731f, 1.0f)
                lineToRelative(2.044f, -3.527f)
                arcTo(6.947f, 6.947f, 0.0f, false, false, 11.0f, 18.92f)
                verticalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(18.92f)
                arcToRelative(6.947f, 6.947f, 0.0f, false, false, 1.607f, -0.429f)
                lineToRelative(2.044f, 3.527f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.731f, -1.0f)
                lineToRelative(-2.046f, -3.531f)
                arcToRelative(7.062f, 7.062f, 0.0f, false, false, 1.149f, -1.15f)
                lineToRelative(3.53f, 2.047f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.731f)
                lineToRelative(-3.527f, -2.044f)
                arcTo(6.924f, 6.924f, 0.0f, false, false, 18.92f, 13.0f)
                horizontalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 11.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-6.608f, -0.21f, -6.606f, -9.791f, 0.0f, -10.0f)
                curveTo(18.608f, 7.21f, 18.606f, 16.791f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
