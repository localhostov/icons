package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.PhoneRotary: ImageVector
    get() {
        if (_phoneRotary != null) {
            return _phoneRotary!!
        }
        _phoneRotary = Builder(name = "PhoneRotary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.251f)
                curveToRelative(0.0f, -1.415f, -0.564f, -2.76f, -1.593f, -3.789f)
                curveTo(17.835f, -1.11f, 6.163f, -1.109f, 1.593f, 3.462f)
                curveTo(0.564f, 4.491f, 0.0f, 5.836f, 0.0f, 7.25f)
                verticalLineToRelative(3.75f)
                horizontalLineToRelative(3.333f)
                lineToRelative(-1.803f, 3.382f)
                curveToRelative(-1.001f, 1.875f, -1.53f, 3.991f, -1.53f, 6.118f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -2.127f, -0.529f, -4.243f, -1.529f, -6.118f)
                lineToRelative(-1.804f, -3.382f)
                horizontalLineToRelative(3.333f)
                verticalLineToRelative(-3.749f)
                close()
                moveTo(22.0f, 20.5f)
                verticalLineToRelative(1.5f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.8f, 0.447f, -3.59f, 1.295f, -5.176f)
                lineToRelative(2.579f, -4.836f)
                lineToRelative(1.351f, -2.252f)
                curveToRelative(0.585f, -0.32f, 2.46f, -1.236f, 4.775f, -1.236f)
                reflectiveCurveToRelative(4.193f, 0.917f, 4.775f, 1.236f)
                lineToRelative(1.351f, 2.252f)
                lineToRelative(2.58f, 4.837f)
                curveToRelative(0.847f, 1.586f, 1.294f, 3.375f, 1.294f, 5.176f)
                close()
                moveTo(22.0f, 9.0f)
                horizontalLineToRelative(-2.434f)
                lineToRelative(-1.33f, -2.217f)
                reflectiveCurveToRelative(-2.842f, -1.783f, -6.236f, -1.783f)
                reflectiveCurveToRelative(-6.236f, 1.783f, -6.236f, 1.783f)
                lineToRelative(-1.33f, 2.217f)
                horizontalLineToRelative(-2.434f)
                verticalLineToRelative(-1.751f)
                curveToRelative(0.0f, -0.88f, 0.356f, -1.723f, 1.007f, -2.373f)
                curveToRelative(3.867f, -3.865f, 14.121f, -3.865f, 17.986f, 0.0f)
                curveToRelative(0.65f, 0.65f, 1.008f, 1.493f, 1.007f, 2.374f)
                verticalLineToRelative(1.75f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _phoneRotary!!
    }

private var _phoneRotary: ImageVector? = null
