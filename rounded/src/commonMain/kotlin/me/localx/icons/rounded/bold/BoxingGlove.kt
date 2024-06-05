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

public val Icons.Bold.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) {
            return _boxingGlove!!
        }
        _boxingGlove = Builder(name = "BoxingGlove", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.256f)
                arcTo(7.509f, 7.509f, 0.0f, false, false, 12.5f, 0.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(7.508f, 7.508f, 0.0f, false, false, 1.0f, 7.5f)
                verticalLineToRelative(6.144f)
                arcTo(8.535f, 8.535f, 0.0f, false, false, 3.643f, 19.8f)
                lineToRelative(0.357f, 0.34f)
                lineTo(4.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineToRelative(-0.3f)
                lineToRelative(0.96f, -0.8f)
                arcTo(8.482f, 8.482f, 0.0f, false, false, 23.0f, 13.381f)
                lineTo(23.0f, 11.5f)
                arcTo(4.508f, 4.508f, 0.0f, false, false, 20.0f, 7.256f)
                close()
                moveTo(20.0f, 13.381f)
                arcTo(5.489f, 5.489f, 0.0f, false, true, 18.032f, 17.6f)
                reflectiveCurveToRelative(-1.6f, 1.35f, -1.649f, 1.4f)
                lineTo(6.914f, 19.0f)
                lineToRelative(-1.2f, -1.37f)
                arcTo(5.526f, 5.526f, 0.0f, false, true, 4.0f, 13.644f)
                verticalLineToRelative(-1.9f)
                arcTo(4.488f, 4.488f, 0.0f, false, false, 5.5f, 12.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 7.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 8.5f, 3.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(4.506f, 4.506f, 0.0f, false, true, 4.493f, 4.259f)
                arcTo(4.509f, 4.509f, 0.0f, false, false, 14.0f, 11.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
