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

public val Icons.Filled.DogLeashed: ImageVector
    get() {
        if (_dogLeashed != null) {
            return _dogLeashed!!
        }
        _dogLeashed = Builder(name = "DogLeashed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.998f, 8.003f)
                lineToRelative(4.002f, -0.002f)
                verticalLineToRelative(9.997f)
                lineToRelative(-4.0f, 0.002f)
                verticalLineToRelative(3.506f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.499f, -2.499f, 2.499f)
                reflectiveCurveToRelative(-2.498f, -1.12f, -2.499f, -2.498f)
                lineToRelative(-0.002f, -8.503f)
                curveToRelative(0.0f, -0.921f, 0.251f, -1.785f, 0.687f, -2.528f)
                curveToRelative(-1.092f, -0.643f, -2.688f, -2.004f, -2.688f, -4.476f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                curveToRelative(0.0f, 1.81f, 1.475f, 2.674f, 2.075f, 2.951f)
                curveToRelative(0.822f, -0.596f, 1.832f, -0.948f, 2.923f, -0.948f)
                close()
                moveTo(22.0f, 5.0f)
                horizontalLineToRelative(-0.382f)
                curveToRelative(-0.309f, 0.0f, -0.586f, -0.171f, -0.724f, -0.447f)
                curveToRelative(-0.479f, -0.958f, -1.442f, -1.553f, -2.512f, -1.553f)
                horizontalLineToRelative(-1.382f)
                lineTo(17.0f, 0.77f)
                curveToRelative(0.0f, -0.525f, -0.522f, -0.904f, -1.015f, -0.726f)
                curveToRelative(-1.157f, 0.416f, -1.985f, 1.523f, -1.985f, 2.824f)
                verticalLineToRelative(1.632f)
                lineToRelative(-1.112f, 3.048f)
                lineTo(2.581f, 0.186f)
                curveToRelative(-0.449f, -0.321f, -1.074f, -0.218f, -1.395f, 0.233f)
                curveToRelative(-0.321f, 0.449f, -0.217f, 1.074f, 0.233f, 1.395f)
                lineToRelative(8.66f, 6.186f)
                horizontalLineToRelative(3.194f)
                lineToRelative(6.896f, 2.925f)
                lineToRelative(0.01f, -0.031f)
                curveToRelative(2.123f, -0.094f, 3.82f, -1.851f, 3.82f, -3.996f)
                curveToRelative(0.0f, -0.92f, -0.701f, -1.898f, -2.0f, -1.898f)
                close()
                moveTo(13.0f, 21.5f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-3.265f)
                curveToRelative(0.0f, -0.4f, 0.041f, -0.801f, 0.12f, -1.193f)
                lineToRelative(1.41f, -4.207f)
                lineToRelative(-6.529f, -2.749f)
                verticalLineToRelative(11.415f)
                close()
            }
        }
        .build()
        return _dogLeashed!!
    }

private var _dogLeashed: ImageVector? = null
