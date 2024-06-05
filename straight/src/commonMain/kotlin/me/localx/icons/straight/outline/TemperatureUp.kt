package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.TemperatureUp: ImageVector
    get() {
        if (_temperatureUp != null) {
            return _temperatureUp!!
        }
        _temperatureUp = Builder(name = "TemperatureUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 14.169f)
                lineTo(8.0f, 4.875f)
                lineTo(6.0f, 4.875f)
                verticalLineToRelative(9.294f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 2.0f, 0.0f)
                close()
                moveTo(7.0f, 17.985f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 17.985f)
                close()
                moveTo(12.0f, 4.985f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -10.0f, 0.0f)
                lineTo(2.0f, 12.1f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 10.0f, 0.0f)
                close()
                moveTo(7.0f, 21.985f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, true, -3.332f, -8.719f)
                lineToRelative(0.332f, -0.3f)
                lineTo(4.0f, 4.985f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                verticalLineToRelative(7.983f)
                lineToRelative(0.332f, 0.3f)
                arcTo(4.994f, 4.994f, 0.0f, false, true, 7.0f, 21.985f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.293f, 5.293f)
                lineToRelative(1.414f, -1.414f)
                lineTo(20.414f, 0.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.828f, 0.0f)
                lineTo(14.293f, 3.879f)
                lineToRelative(1.414f, 1.414f)
                lineTo(18.0f, 3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _temperatureUp!!
    }

private var _temperatureUp: ImageVector? = null
