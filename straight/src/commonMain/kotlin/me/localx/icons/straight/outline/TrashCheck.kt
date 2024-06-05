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

public val Icons.Outline.TrashCheck: ImageVector
    get() {
        if (_trashCheck != null) {
            return _trashCheck!!
        }
        _trashCheck = Builder(name = "TrashCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.644f)
                lineToRelative(1.703f, 15.331f)
                curveToRelative(0.169f, 1.521f, 1.451f, 2.669f, 2.982f, 2.669f)
                horizontalLineToRelative(9.304f)
                curveToRelative(1.53f, 0.0f, 2.812f, -1.147f, 2.982f, -2.669f)
                lineToRelative(1.703f, -15.331f)
                horizontalLineToRelative(1.682f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(17.627f, 21.109f)
                curveToRelative(-0.057f, 0.508f, -0.484f, 0.891f, -0.994f, 0.891f)
                lineTo(7.329f, 22.0f)
                curveToRelative(-0.51f, 0.0f, -0.938f, -0.383f, -0.994f, -0.89f)
                lineToRelative(-1.679f, -15.11f)
                horizontalLineToRelative(14.65f)
                lineToRelative(-1.678f, 15.109f)
                close()
                moveTo(9.086f, 16.414f)
                lineToRelative(-2.498f, -2.411f)
                lineToRelative(1.39f, -1.439f)
                lineToRelative(2.51f, 2.424f)
                lineToRelative(5.401f, -5.29f)
                lineToRelative(1.402f, 1.426f)
                lineToRelative(-5.383f, 5.297f)
                curveToRelative(-0.386f, 0.386f, -0.896f, 0.58f, -1.406f, 0.58f)
                reflectiveCurveToRelative(-1.025f, -0.195f, -1.416f, -0.586f)
                close()
            }
        }
        .build()
        return _trashCheck!!
    }

private var _trashCheck: ImageVector? = null
