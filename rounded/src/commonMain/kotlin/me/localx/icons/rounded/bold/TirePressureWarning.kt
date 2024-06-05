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

public val Icons.Bold.TirePressureWarning: ImageVector
    get() {
        if (_tirePressureWarning != null) {
            return _tirePressureWarning!!
        }
        _tirePressureWarning = Builder(name = "TirePressureWarning", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 10.5f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 10.5f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 16.0f)
                close()
                moveTo(24.0f, 12.409f)
                arcTo(12.051f, 12.051f, 0.0f, false, false, 21.363f, 4.8f)
                arcTo(5.586f, 5.586f, 0.0f, false, true, 20.0f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                arcToRelative(8.378f, 8.378f, 0.0f, false, false, 2.02f, 5.174f)
                arcTo(8.189f, 8.189f, 0.0f, false, true, 17.091f, 19.0f)
                lineTo(6.909f, 19.0f)
                arcTo(8.188f, 8.188f, 0.0f, false, true, 4.98f, 6.674f)
                arcTo(8.378f, 8.378f, 0.0f, false, false, 7.0f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                arcTo(5.586f, 5.586f, 0.0f, false, true, 2.637f, 4.8f)
                arcTo(11.176f, 11.176f, 0.0f, false, false, 5.0f, 21.331f)
                lineTo(5.0f, 22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(8.0f, 22.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(13.5f, 22.0f)
                lineTo(16.0f, 22.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(19.0f, 21.331f)
                arcTo(10.97f, 10.97f, 0.0f, false, false, 24.0f, 12.409f)
                close()
            }
        }
        .build()
        return _tirePressureWarning!!
    }

private var _tirePressureWarning: ImageVector? = null
