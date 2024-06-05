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

public val Icons.Outline.MarkerTime: ImageVector
    get() {
        if (_markerTime != null) {
            return _markerTime!!
        }
        _markerTime = Builder(name = "MarkerTime", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 24.0f)
                arcToRelative(5.419f, 5.419f, 0.0f, false, true, -3.808f, -1.552f)
                lineToRelative(-3.942f, -3.643f)
                arcToRelative(11.0f, 11.0f, 0.0f, true, true, 15.527f, -15.583f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, 0.0f, 15.556f)
                lineToRelative(-3.991f, 3.689f)
                arcToRelative(5.39f, 5.39f, 0.0f, false, true, -3.786f, 1.533f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -6.364f, 15.364f)
                lineToRelative(3.934f, 3.636f)
                arcToRelative(3.516f, 3.516f, 0.0f, false, false, 4.838f, 0.019f)
                lineToRelative(3.984f, -3.682f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.029f, -12.7f)
                arcToRelative(8.94f, 8.94f, 0.0f, false, false, -6.363f, -2.637f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 7.0f, -7.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, true, -7.0f, 7.0f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.0f, 5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                close()
                moveTo(13.707f, 12.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                lineToRelative(-0.707f, -0.707f)
                verticalLineToRelative(-1.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.293f, 0.707f)
                lineToRelative(1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _markerTime!!
    }

private var _markerTime: ImageVector? = null
