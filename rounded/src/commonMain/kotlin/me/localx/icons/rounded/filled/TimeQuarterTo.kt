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

public val Icons.Filled.TimeQuarterTo: ImageVector
    get() {
        if (_timeQuarterTo != null) {
            return _timeQuarterTo!!
        }
        _timeQuarterTo = Builder(name = "TimeQuarterTo", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.181f, 0.207f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.181f, 0.983f)
                verticalLineToRelative(2.879f)
                arcToRelative(7.954f, 7.954f, 0.0f, false, false, -8.931f, 8.931f)
                horizontalLineToRelative(-2.879f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.983f, 1.181f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 13.974f, -13.974f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, true, -1.723f, -1.0f)
                horizontalLineToRelative(-2.277f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.277f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.723f, -0.723f)
                verticalLineToRelative(-3.277f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(3.277f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, true, -1.0f, 3.723f)
                close()
                moveTo(9.972f, 0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(5.872f, 1.856f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.997f, -1.002f)
                close()
                moveTo(2.779f, 4.841f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(1.179f, 9.008f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.998f, -1.0f)
                close()
            }
        }
        .build()
        return _timeQuarterTo!!
    }

private var _timeQuarterTo: ImageVector? = null
