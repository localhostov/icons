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

public val Icons.Filled.TimeHalfPast: ImageVector
    get() {
        if (_timeHalfPast != null) {
            return _timeHalfPast!!
        }
        _timeHalfPast = Builder(name = "TimeHalfPast", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.181f, 0.207f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.181f, 0.983f)
                verticalLineToRelative(2.879f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 15.862f)
                verticalLineToRelative(2.879f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.181f, 0.983f)
                arcToRelative(11.991f, 11.991f, 0.0f, false, false, 0.0f, -23.586f)
                close()
                moveTo(13.0f, 13.723f)
                verticalLineToRelative(2.277f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-2.277f)
                arcToRelative(1.984f, 1.984f, 0.0f, false, true, 0.0f, -3.446f)
                verticalLineToRelative(-3.277f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(3.277f)
                arcToRelative(1.984f, 1.984f, 0.0f, false, true, 0.0f, 3.446f)
                close()
                moveTo(2.986f, 4.968f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.17f, 0.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.17f, -0.8f)
                close()
                moveTo(1.386f, 8.955f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.17f, 0.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.167f, -0.8f)
                close()
                moveTo(10.128f, 21.823f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.17f, 0.794f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.167f, -0.794f)
                close()
                moveTo(6.008f, 1.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.17f, 0.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.17f, -0.8f)
                close()
                moveTo(10.182f, 0.209f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.182f, 0.771f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.182f, -0.771f)
                close()
                moveTo(0.234f, 14.046f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.8f, 1.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.8f, -1.17f)
                close()
                moveTo(1.915f, 18.009f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.8f, 1.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.8f, -1.17f)
                close()
                moveTo(4.967f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.8f, 1.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.8f, -1.17f)
                close()
            }
        }
        .build()
        return _timeHalfPast!!
    }

private var _timeHalfPast: ImageVector? = null
