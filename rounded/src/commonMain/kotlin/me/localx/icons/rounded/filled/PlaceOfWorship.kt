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

public val Icons.Filled.PlaceOfWorship: ImageVector
    get() {
        if (_placeOfWorship != null) {
            return _placeOfWorship!!
        }
        _placeOfWorship = Builder(name = "PlaceOfWorship", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 19.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                close()
                moveTo(0.0f, 15.564f)
                verticalLineToRelative(4.936f)
                curveToRelative(0.0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-14.619f)
                lineToRelative(-2.941f, 2.138f)
                curveToRelative(-1.294f, 0.941f, -2.059f, 2.444f, -2.059f, 4.044f)
                close()
                moveTo(21.941f, 11.52f)
                lineToRelative(-2.941f, -2.138f)
                verticalLineToRelative(14.619f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.933f, 0.0f, 3.5f, -1.567f, 3.5f, -3.5f)
                verticalLineToRelative(-4.936f)
                curveToRelative(0.0f, -1.6f, -0.766f, -3.103f, -2.059f, -4.044f)
                close()
                moveTo(13.147f, 0.303f)
                lineToRelative(2.573f, 1.801f)
                curveToRelative(0.802f, 0.561f, 1.28f, 1.479f, 1.28f, 2.458f)
                verticalLineToRelative(19.438f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.85f, -1.683f, -3.314f, -3.598f, -2.942f)
                curveToRelative(-1.424f, 0.277f, -2.402f, 1.609f, -2.402f, 3.06f)
                verticalLineToRelative(4.882f)
                reflectiveCurveToRelative(-2.0f, 0.0f, -2.0f, 0.0f)
                lineTo(7.0f, 4.562f)
                curveToRelative(0.0f, -0.979f, 0.478f, -1.896f, 1.28f, -2.458f)
                lineToRelative(2.573f, -1.801f)
                curveToRelative(0.689f, -0.482f, 1.605f, -0.482f, 2.294f, 0.0f)
                close()
                moveTo(13.5f, 11.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _placeOfWorship!!
    }

private var _placeOfWorship: ImageVector? = null
