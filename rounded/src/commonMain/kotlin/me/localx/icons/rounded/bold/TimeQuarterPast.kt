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

public val Icons.Bold.TimeQuarterPast: ImageVector
    get() {
        if (_timeQuarterPast != null) {
            return _timeQuarterPast!!
        }
        _timeQuarterPast = Builder(name = "TimeQuarterPast", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.5f, 13.5f)
                horizontalLineToRelative(-2.19f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, true, -2.81f, -2.81f)
                verticalLineToRelative(-3.69f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(12.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, 9.0f, 9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -12.0f, -12.0f)
                close()
                moveTo(3.0f, 12.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                close()
                moveTo(6.74f, 1.894f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(2.913f, 5.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(6.74f, 20.106f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(2.913f, 16.25f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(21.106f, 15.76f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(17.25f, 19.587f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _timeQuarterPast!!
    }

private var _timeQuarterPast: ImageVector? = null
