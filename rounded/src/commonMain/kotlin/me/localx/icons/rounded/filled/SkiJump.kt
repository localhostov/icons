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

public val Icons.Filled.SkiJump: ImageVector
    get() {
        if (_skiJump != null) {
            return _skiJump!!
        }
        _skiJump = Builder(name = "SkiJump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.759f, 12.266f)
                arcToRelative(3.974f, 3.974f, 0.0f, false, true, -2.068f, 2.257f)
                lineTo(1.42f, 23.908f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.84f, -1.816f)
                lineTo(5.0f, 20.046f)
                verticalLineToRelative(-5.78f)
                arcToRelative(5.958f, 5.958f, 0.0f, false, true, 1.758f, -4.243f)
                lineTo(10.781f, 6.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 4.0f)
                horizontalLineToRelative(8.507f)
                arcTo(3.277f, 3.277f, 0.0f, false, true, 15.0f, 6.718f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, true, -0.879f, 2.159f)
                reflectiveCurveTo(7.036f, 15.957f, 7.0f, 15.984f)
                verticalLineTo(19.12f)
                lineToRelative(13.849f, -6.411f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.963f, -2.656f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.812f, -0.846f)
                arcTo(3.975f, 3.975f, 0.0f, false, true, 23.759f, 12.266f)
                close()
                moveTo(16.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 14.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 5.0f)
                close()
            }
        }
        .build()
        return _skiJump!!
    }

private var _skiJump: ImageVector? = null
