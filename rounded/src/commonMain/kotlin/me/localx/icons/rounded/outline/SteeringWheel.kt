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

public val Icons.Outline.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) {
            return _steeringWheel!!
        }
        _steeringWheel = Builder(name = "SteeringWheel", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.59f, 15.905f, 23.416f, 15.89f, 24.0f, 0.0f)
                verticalLineToRelative(0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.01f, 10.01f, 0.0f, false, true, 8.878f, 5.4f)
                lineToRelative(-7.049f, 1.41f)
                arcToRelative(9.64f, 9.64f, 0.0f, false, true, -3.8f, 0.0f)
                lineTo(3.108f, 7.428f)
                arcTo(10.01f, 10.01f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(9.0f, 21.54f)
                arcToRelative(10.027f, 10.027f, 0.0f, false, true, -6.935f, -8.4f)
                lineToRelative(3.9f, 0.78f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, true, 2.05f, 1.515f)
                lineToRelative(0.624f, 1.153f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 18.014f)
                close()
                moveTo(15.0f, 21.54f)
                lineTo(15.0f, 18.014f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.362f, -1.428f)
                lineToRelative(0.624f, -1.154f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.05f, -1.514f)
                lineToRelative(3.9f, -0.78f)
                arcTo(10.027f, 10.027f, 0.0f, false, true, 15.0f, 21.54f)
                close()
                moveTo(17.644f, 11.957f)
                arcToRelative(4.987f, 4.987f, 0.0f, false, false, -3.416f, 2.522f)
                lineTo(13.6f, 15.633f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, false, -0.6f, 2.381f)
                lineTo(13.0f, 21.95f)
                arcToRelative(10.126f, 10.126f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(11.0f, 18.014f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, false, -0.6f, -2.381f)
                lineTo(9.772f, 14.48f)
                arcToRelative(4.985f, 4.985f, 0.0f, false, false, -3.416f, -2.523f)
                lineToRelative(-4.314f, -0.863f)
                arcToRelative(9.82f, 9.82f, 0.0f, false, true, 0.324f, -1.775f)
                lineToRelative(7.272f, 1.454f)
                arcToRelative(11.629f, 11.629f, 0.0f, false, false, 4.583f, 0.0f)
                lineToRelative(7.406f, -1.481f)
                arcToRelative(9.845f, 9.845f, 0.0f, false, true, 0.331f, 1.8f)
                close()
            }
        }
        .build()
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
