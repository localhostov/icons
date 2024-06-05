package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.HammerCrash: ImageVector
    get() {
        if (_hammerCrash != null) {
            return _hammerCrash!!
        }
        _hammerCrash = Builder(name = "HammerCrash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 15.8494f)
                lineToRelative(2.3613f, -1.8488f)
                lineToRelative(1.8495f, 2.3621f)
                lineToRelative(-2.3613f, 1.8488f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9994f, 12.5269f)
                lineToRelative(1.4728f, -2.6136f)
                lineToRelative(2.6136f, 1.4728f)
                lineToRelative(-1.4728f, 2.6136f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.875f, 11.731f)
                lineToRelative(2.442f, -4.457f)
                curveToRelative(0.315f, -0.576f, 0.389f, -1.24f, 0.204f, -1.871f)
                reflectiveCurveToRelative(-0.604f, -1.151f, -1.179f, -1.467f)
                lineTo(12.009f, 1.013f)
                curveTo(10.085f, -0.04f, 7.867f, -0.281f, 5.761f, 0.332f)
                curveTo(3.656f, 0.946f, 1.916f, 2.345f, 0.863f, 4.266f)
                lineToRelative(-0.863f, 1.568f)
                lineToRelative(6.674f, 3.658f)
                lineTo(0.0f, 22.132f)
                lineToRelative(3.537f, 1.868f)
                lineToRelative(6.645f, -12.586f)
                lineToRelative(2.355f, 1.291f)
                curveToRelative(0.367f, 0.201f, 0.771f, 0.304f, 1.179f, 0.304f)
                curveToRelative(0.231f, 0.0f, 0.464f, -0.033f, 0.692f, -0.1f)
                curveToRelative(0.631f, -0.185f, 1.151f, -0.604f, 1.467f, -1.179f)
                close()
                moveTo(13.504f, 9.815f)
                lineTo(4.199f, 4.715f)
                curveToRelative(0.64f, -0.709f, 1.464f, -1.229f, 2.403f, -1.503f)
                curveToRelative(1.338f, -0.392f, 2.746f, -0.237f, 3.965f, 0.432f)
                lineToRelative(4.86f, 2.663f)
                lineToRelative(-1.923f, 3.508f)
                close()
            }
        }
        .build()
        return _hammerCrash!!
    }

private var _hammerCrash: ImageVector? = null
