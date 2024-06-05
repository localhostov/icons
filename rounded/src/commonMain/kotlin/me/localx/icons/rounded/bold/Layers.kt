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

public val Icons.Bold.Layers: ImageVector
    get() {
        if (_layers != null) {
            return _layers!!
        }
        _layers = Builder(name = "Layers", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.912f, 10.6f)
                lineTo(10.2f, 16.169f)
                arcToRelative(3.492f, 3.492f, 0.0f, false, false, 3.6f, 0.0f)
                lineTo(23.088f, 10.6f)
                arcToRelative(1.861f, 1.861f, 0.0f, false, false, 0.0f, -3.192f)
                lineTo(13.8f, 1.831f)
                arcToRelative(3.489f, 3.489f, 0.0f, false, false, -3.6f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(0.912f, 7.4f)
                arcToRelative(1.861f, 1.861f, 0.0f, false, false, 0.0f, 3.192f)
                close()
                moveTo(11.743f, 4.4f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.514f, 0.0f)
                lineTo(19.918f, 9.0f)
                lineToRelative(-7.661f, 4.6f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.514f, 0.0f)
                lineTo(4.082f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.286f, 18.831f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.572f, 0.0f)
                lineTo(2.272f, 13.766f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 15.052f)
                horizontalLineTo(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.728f, 1.286f)
                lineTo(9.17f, 21.4f)
                arcToRelative(5.488f, 5.488f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(8.442f, -5.065f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.0f, 15.052f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.272f, -1.286f)
                close()
            }
        }
        .build()
        return _layers!!
    }

private var _layers: ImageVector? = null
