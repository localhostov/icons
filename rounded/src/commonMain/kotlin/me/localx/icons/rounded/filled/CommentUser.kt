package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.CommentUser: ImageVector
    get() {
        if (_commentUser != null) {
            return _commentUser!!
        }
        _commentUser = Builder(name = "CommentUser", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 169.515f)
                curveToRelative(17.944f, 0.0f, 32.491f, -14.547f, 32.491f, -32.491f)
                reflectiveCurveTo(273.944f, 104.533f, 256.0f, 104.533f)
                reflectiveCurveToRelative(-32.491f, 14.547f, -32.491f, 32.491f)
                reflectiveCurveTo(238.056f, 169.515f, 256.0f, 169.515f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(426.667f, 0.016f)
                horizontalLineTo(85.333f)
                curveTo(37.894f, 0.391f, -0.284f, 39.104f, 0.0f, 86.544f)
                verticalLineTo(346.17f)
                curveToRelative(-0.284f, 47.443f, 37.891f, 86.162f, 85.333f, 86.549f)
                horizontalLineToRelative(62.357f)
                lineToRelative(79.957f, 68.267f)
                curveToRelative(15.838f, 14.474f, 40.039f, 14.686f, 56.128f, 0.491f)
                lineToRelative(82.027f, -68.779f)
                horizontalLineToRelative(60.864f)
                curveToRelative(47.442f, -0.387f, 85.617f, -39.106f, 85.333f, -86.549f)
                verticalLineTo(86.544f)
                curveTo(512.284f, 39.104f, 474.106f, 0.391f, 426.667f, 0.016f)
                close()
                moveTo(256.0f, 64.912f)
                curveToRelative(98.453f, 2.603f, 98.432f, 148.843f, 0.0f, 151.467f)
                curveTo(157.547f, 213.754f, 157.568f, 67.578f, 256.0f, 64.912f)
                close()
                moveTo(346.645f, 367.12f)
                curveToRelative(-11.416f, 2.913f, -23.032f, -3.981f, -25.945f, -15.397f)
                curveToRelative(-0.013f, -0.052f, -0.026f, -0.103f, -0.039f, -0.155f)
                curveToRelative(-10.919f, -35.717f, -48.726f, -55.82f, -84.443f, -44.901f)
                curveToRelative(-21.5f, 6.573f, -38.328f, 23.401f, -44.901f, 44.901f)
                curveToRelative(-2.981f, 11.405f, -14.643f, 18.234f, -26.048f, 15.253f)
                curveToRelative(-11.405f, -2.981f, -18.234f, -14.643f, -15.253f, -26.048f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(16.496f, -58.539f, 77.324f, -92.622f, 135.863f, -76.126f)
                curveToRelative(36.895f, 10.397f, 65.729f, 39.231f, 76.126f, 76.126f)
                curveTo(364.975f, 352.281f, 358.123f, 364.034f, 346.645f, 367.12f)
                close()
            }
        }
        .build()
        return _commentUser!!
    }

private var _commentUser: ImageVector? = null
