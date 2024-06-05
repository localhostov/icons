package me.localx.icons.straight.filled

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

public val Icons.Filled.Bike: ImageVector
    get() {
        if (_bike != null) {
            return _bike!!
        }
        _bike = Builder(name = "Bike", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.79f, 12.08f)
                curveToRelative(-0.77f, -2.868f, -1.923f, -6.013f, -2.5f, -7.534f)
                arcToRelative(14.618f, 14.618f, 0.0f, false, true, 1.5f, -0.515f)
                arcToRelative(0.931f, 0.931f, 0.0f, false, true, 0.81f, 0.17f)
                arcToRelative(1.014f, 1.014f, 0.0f, false, true, 0.4f, 0.809f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.181f, -2.395f)
                arcTo(2.914f, 2.914f, 0.0f, false, false, 18.276f, 2.1f)
                arcToRelative(21.2f, 21.2f, 0.0f, false, false, -2.687f, 0.989f)
                lineToRelative(-0.873f, 0.393f)
                lineToRelative(0.355f, 0.891f)
                curveToRelative(0.01f, 0.024f, 0.506f, 1.267f, 1.121f, 2.99f)
                lineTo(12.02f, 10.606f)
                lineTo(8.414f, 7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.586f)
                lineToRelative(4.843f, 4.844f)
                lineTo(8.441f, 13.39f)
                arcToRelative(4.954f, 4.954f, 0.0f, true, false, 1.151f, 1.639f)
                lineTo(16.88f, 9.361f)
                curveToRelative(0.3f, 0.918f, 0.6f, 1.881f, 0.866f, 2.818f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 2.044f, -0.1f)
                close()
            }
        }
        .build()
        return _bike!!
    }

private var _bike: ImageVector? = null
