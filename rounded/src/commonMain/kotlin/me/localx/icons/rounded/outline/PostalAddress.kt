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

public val Icons.Outline.PostalAddress: ImageVector
    get() {
        if (_postalAddress != null) {
            return _postalAddress!!
        }
        _postalAddress = Builder(name = "PostalAddress", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.691f, 20.777f)
                curveToRelative(0.399f, 0.382f, 0.413f, 1.016f, 0.031f, 1.414f)
                curveToRelative(-0.196f, 0.205f, -0.459f, 0.309f, -0.722f, 0.309f)
                curveToRelative(-0.249f, 0.0f, -0.498f, -0.092f, -0.691f, -0.277f)
                lineToRelative(-5.364f, -5.136f)
                curveToRelative(-3.915f, -3.915f, -3.915f, -10.259f, -0.016f, -14.158f)
                curveTo(4.818f, 1.04f, 7.329f, 0.0f, 10.0f, 0.0f)
                reflectiveCurveToRelative(5.182f, 1.04f, 7.071f, 2.929f)
                curveToRelative(2.16f, 2.16f, 3.205f, 5.143f, 2.867f, 8.182f)
                curveToRelative(-0.061f, 0.549f, -0.547f, 0.938f, -1.104f, 0.884f)
                curveToRelative(-0.549f, -0.062f, -0.944f, -0.556f, -0.883f, -1.104f)
                curveToRelative(0.27f, -2.433f, -0.566f, -4.818f, -2.294f, -6.547f)
                curveToRelative(-1.511f, -1.511f, -3.52f, -2.343f, -5.657f, -2.343f)
                reflectiveCurveToRelative(-4.146f, 0.832f, -5.657f, 2.343f)
                curveToRelative(-3.119f, 3.119f, -3.119f, 8.195f, 0.0f, 11.314f)
                lineToRelative(5.349f, 5.12f)
                close()
                moveTo(10.0f, 14.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                close()
                moveTo(24.0f, 17.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(15.586f, 16.0f)
                lineToRelative(1.707f, 1.707f)
                curveToRelative(0.378f, 0.379f, 1.037f, 0.379f, 1.414f, 0.0f)
                lineToRelative(1.707f, -1.707f)
                horizontalLineToRelative(-4.828f)
                close()
                moveTo(22.0f, 21.0f)
                verticalLineToRelative(-3.758f)
                lineToRelative(-1.879f, 1.879f)
                curveToRelative(-0.566f, 0.566f, -1.319f, 0.879f, -2.121f, 0.879f)
                reflectiveCurveToRelative(-1.555f, -0.312f, -2.122f, -0.879f)
                lineToRelative(-1.878f, -1.879f)
                verticalLineToRelative(3.758f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _postalAddress!!
    }

private var _postalAddress: ImageVector? = null
