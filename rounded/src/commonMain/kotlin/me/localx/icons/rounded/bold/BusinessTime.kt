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

public val Icons.Bold.BusinessTime: ImageVector
    get() {
        if (_businessTime != null) {
            return _businessTime!!
        }
        _businessTime = Builder(name = "BusinessTime", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 14.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.972f, 0.034f, 1.971f, 2.967f, 0.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(0.0f, 8.5f)
                curveTo(0.0f, 5.467f, 2.468f, 3.0f, 5.5f, 3.0f)
                horizontalLineToRelative(0.627f)
                curveToRelative(0.445f, -1.723f, 2.013f, -3.0f, 3.873f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.861f, 0.0f, 3.428f, 1.277f, 3.873f, 3.0f)
                horizontalLineToRelative(0.627f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                curveToRelative(-0.034f, 1.971f, -2.966f, 1.972f, -3.0f, 0.0f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 6.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.972f, 0.034f, 1.971f, 2.967f, 0.0f, 3.0f)
                lineTo(3.0f, 14.0f)
                close()
                moveTo(24.0f, 17.5f)
                curveToRelative(-0.265f, 8.592f, -12.736f, 8.59f, -13.0f, 0.0f)
                curveToRelative(0.265f, -8.592f, 12.736f, -8.59f, 13.0f, 0.0f)
                close()
                moveTo(19.844f, 17.723f)
                lineToRelative(-0.844f, -0.844f)
                verticalLineToRelative(-1.379f)
                curveToRelative(-0.034f, -1.972f, -2.967f, -1.971f, -3.0f, 0.0f)
                verticalLineToRelative(1.793f)
                curveToRelative(0.0f, 0.53f, 0.211f, 1.039f, 0.586f, 1.414f)
                lineToRelative(1.137f, 1.137f)
                curveToRelative(0.586f, 0.586f, 1.535f, 0.586f, 2.121f, 0.0f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                close()
            }
        }
        .build()
        return _businessTime!!
    }

private var _businessTime: ImageVector? = null
