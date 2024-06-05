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

public val Icons.Filled.TachometerSlowest: ImageVector
    get() {
        if (_tachometerSlowest != null) {
            return _tachometerSlowest!!
        }
        _tachometerSlowest = Builder(name = "TachometerSlowest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 13.0f)
                arcToRelative(11.942f, 11.942f, 0.0f, false, false, 3.186f, 8.133f)
                arcToRelative(2.316f, 2.316f, 0.0f, false, false, 3.9f, -0.487f)
                lineToRelative(0.629f, -1.132f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.588f, 19.0f)
                horizontalLineToRelative(6.824f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.874f, 0.514f)
                lineToRelative(0.612f, 1.1f)
                arcToRelative(2.318f, 2.318f, 0.0f, false, false, 3.964f, 0.465f)
                curveTo(30.716f, 9.486f, 15.633f, -5.655f, 4.0f, 4.052f)
                arcTo(12.016f, 12.016f, 0.0f, false, false, 0.0f, 13.0f)
                close()
                moveTo(5.143f, 14.918f)
                lineTo(10.011f, 12.781f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.8f, 1.833f)
                lineTo(5.948f, 16.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -0.805f, -1.832f)
                close()
            }
        }
        .build()
        return _tachometerSlowest!!
    }

private var _tachometerSlowest: ImageVector? = null
