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

public val Icons.Outline.TimeQuarterTo: ImageVector
    get() {
        if (_timeQuarterTo != null) {
            return _timeQuarterTo!!
        }
        _timeQuarterTo = Builder(name = "TimeQuarterTo", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, -10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(10.277f, 11.0f)
                horizontalLineToRelative(-2.277f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.277f)
                arcToRelative(1.994f, 1.994f, 0.0f, true, false, 2.723f, -2.723f)
                verticalLineToRelative(-3.277f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(3.277f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.723f, 0.723f)
                close()
                moveTo(1.827f, 8.784f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                close()
                moveTo(4.221f, 5.207f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                close()
                moveTo(7.779f, 2.841f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _timeQuarterTo!!
    }

private var _timeQuarterTo: ImageVector? = null
