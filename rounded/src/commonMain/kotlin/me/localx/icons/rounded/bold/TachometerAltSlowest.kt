package me.localx.icons.rounded.bold

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

public val Icons.Bold.TachometerAltSlowest: ImageVector
    get() {
        if (_tachometerAltSlowest != null) {
            return _tachometerAltSlowest!!
        }
        _tachometerAltSlowest = Builder(name = "TachometerAltSlowest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9f, 11.4f)
                arcTo(11.982f, 11.982f, 0.0f, true, false, 3.761f, 21.629f)
                arcTo(5.181f, 5.181f, 0.0f, false, false, 7.336f, 23.0f)
                horizontalLineToRelative(9.323f)
                arcToRelative(5.308f, 5.308f, 0.0f, false, false, 3.726f, -1.512f)
                arcTo(11.859f, 11.859f, 0.0f, false, false, 23.9f, 11.4f)
                close()
                moveTo(18.292f, 19.344f)
                arcTo(2.327f, 2.327f, 0.0f, false, true, 16.659f, 20.0f)
                lineTo(7.336f, 20.0f)
                arcToRelative(2.225f, 2.225f, 0.0f, false, true, -1.52f, -0.557f)
                arcToRelative(8.972f, 8.972f, 0.0f, true, true, 15.109f, -7.67f)
                arcTo(8.889f, 8.889f, 0.0f, false, true, 18.292f, 19.339f)
                close()
                moveTo(14.0f, 13.0f)
                arcToRelative(2.006f, 2.006f, 0.0f, false, true, -2.427f, 1.954f)
                lineTo(8.229f, 16.812f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.458f, -2.624f)
                lineToRelative(3.344f, -1.857f)
                arcTo(2.006f, 2.006f, 0.0f, false, true, 14.0f, 13.0f)
                close()
                moveTo(19.0f, 13.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, true, -1.6f, 4.455f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.313f, -1.91f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.651f, -4.362f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 5.764f, 9.817f)
                curveTo(9.083f, 3.323f, 18.985f, 5.71f, 19.0f, 13.0f)
                close()
            }
        }
        .build()
        return _tachometerAltSlowest!!
    }

private var _tachometerAltSlowest: ImageVector? = null
