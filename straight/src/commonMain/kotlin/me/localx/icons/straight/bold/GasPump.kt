package me.localx.icons.straight.bold

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

public val Icons.Bold.GasPump: ImageVector
    get() {
        if (_gasPump != null) {
            return _gasPump!!
        }
        _gasPump = Builder(name = "GasPump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.879f, 1.0f)
                lineTo(18.0f, 4.879f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.5f, 0.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 3.5f)
                verticalLineTo(24.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(6.121f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(3.5f, 3.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.816f)
                arcToRelative(2.988f, 2.988f, 0.0f, false, false, -0.383f, -0.743f)
                lineTo(12.2f, 5.9f)
                lineTo(9.8f, 4.1f)
                lineTo(7.594f, 7.041f)
                arcTo(2.984f, 2.984f, 0.0f, false, false, 5.184f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 3.0f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
