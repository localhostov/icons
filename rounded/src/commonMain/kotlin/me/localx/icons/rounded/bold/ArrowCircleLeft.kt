package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.ArrowCircleLeft: ImageVector
    get() {
        if (_arrowCircleLeft != null) {
            return _arrowCircleLeft!!
        }
        _arrowCircleLeft = Builder(name = "ArrowCircleLeft", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(3.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 9.0f, 9.0f)
                arcTo(9.011f, 9.011f, 0.0f, false, true, 3.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.185f, 15.449f)
                lineTo(9.269f, 13.5f)
                horizontalLineTo(17.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(9.269f)
                lineToRelative(1.916f, -1.949f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.14f, -2.1f)
                lineTo(6.0f, 9.55f)
                arcToRelative(3.524f, 3.524f, 0.0f, false, false, 0.0f, 4.9f)
                lineToRelative(3.048f, 3.1f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.14f, -2.1f)
                close()
            }
        }
        .build()
        return _arrowCircleLeft!!
    }

private var _arrowCircleLeft: ImageVector? = null
