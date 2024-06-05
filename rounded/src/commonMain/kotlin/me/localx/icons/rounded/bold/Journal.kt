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

public val Icons.Bold.Journal: ImageVector
    get() {
        if (_journal != null) {
            return _journal!!
        }
        _journal = Builder(name = "Journal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.5f, 0.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.133f, 0.0f, -3.986f, 1.221f, -4.898f, 3.0f)
                horizontalLineToRelative(-1.102f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.102f)
                curveToRelative(0.912f, 1.779f, 2.765f, 3.0f, 4.898f, 3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(18.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(15.0f, 18.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(5.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(13.0f, 7.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 2.114f)
                verticalLineToRelative(18.504f)
                curveToRelative(0.0f, 1.0f, -0.397f, 1.96f, -1.105f, 2.667f)
                lineToRelative(-0.588f, 0.588f)
                curveToRelative(-0.17f, 0.17f, -0.445f, 0.17f, -0.615f, 0.0f)
                lineToRelative(-0.588f, -0.588f)
                curveToRelative(-0.707f, -0.707f, -1.105f, -1.667f, -1.105f, -2.667f)
                lineTo(19.999f, 2.0f)
                curveTo(20.0f, 0.827f, 21.009f, -0.109f, 22.206f, 0.01f)
                curveToRelative(1.041f, 0.104f, 1.794f, 1.058f, 1.794f, 2.104f)
                close()
            }
        }
        .build()
        return _journal!!
    }

private var _journal: ImageVector? = null
