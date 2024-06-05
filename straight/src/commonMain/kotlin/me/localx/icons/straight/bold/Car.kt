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

public val Icons.Bold.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.389f, 3.3f)
                arcTo(3.512f, 3.512f, 0.0f, false, false, 17.1f, 1.0f)
                horizontalLineTo(6.9f)
                arcTo(3.493f, 3.493f, 0.0f, false, false, 3.628f, 3.263f)
                lineTo(1.469f, 8.7f)
                arcTo(24.288f, 24.288f, 0.0f, false, false, 0.0f, 17.032f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(17.032f)
                arcToRelative(24.349f, 24.349f, 0.0f, false, false, -1.484f, -8.375f)
                close()
                moveTo(17.0f, 15.5f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 14.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 15.5f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 17.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 15.5f)
                close()
                moveTo(4.271f, 9.765f)
                lineTo(6.432f, 4.329f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.9f, 4.0f)
                horizontalLineTo(17.1f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.485f, 0.37f)
                lineToRelative(2.128f, 5.354f)
                curveToRelative(0.153f, 0.421f, 0.285f, 0.847f, 0.406f, 1.276f)
                horizontalLineTo(3.878f)
                curveTo(4.0f, 10.584f, 4.124f, 10.171f, 4.271f, 9.765f)
                close()
                moveTo(5.5f, 17.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 15.5f)
                horizontalLineTo(4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 14.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 15.5f)
                horizontalLineTo(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 17.0f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
