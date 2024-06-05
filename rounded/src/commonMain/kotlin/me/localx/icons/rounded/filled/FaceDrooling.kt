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

public val Icons.Filled.FaceDrooling: ImageVector
    get() {
        if (_faceDrooling != null) {
            return _faceDrooling!!
        }
        _faceDrooling = Builder(name = "FaceDrooling", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(1.405f, 0.0f, 2.747f, -0.254f, 4.0f, -0.697f)
                verticalLineToRelative(-6.236f)
                curveToRelative(-0.556f, 0.256f, -1.241f, 0.504f, -2.0f, 0.683f)
                verticalLineToRelative(3.25f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-3.107f, 0.0f, -5.563f, -2.162f, -5.666f, -2.254f)
                curveToRelative(-0.412f, -0.368f, -0.448f, -1.0f, -0.08f, -1.412f)
                curveToRelative(0.367f, -0.412f, 1.0f, -0.448f, 1.411f, -0.081f)
                curveToRelative(0.048f, 0.042f, 2.021f, 1.747f, 4.335f, 1.747f)
                curveToRelative(2.384f, 0.0f, 4.391f, -1.435f, 4.411f, -1.449f)
                curveToRelative(0.305f, -0.22f, 0.708f, -0.252f, 1.042f, -0.081f)
                curveToRelative(0.334f, 0.171f, 0.546f, 0.514f, 0.546f, 0.89f)
                verticalLineToRelative(7.022f)
                curveToRelative(3.583f, -2.076f, 6.0f, -5.942f, 6.0f, -10.381f)
                curveTo(24.0f, 5.373f, 18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(9.419f, 8.908f)
                curveToRelative(-1.354f, 0.625f, -2.748f, 1.833f, -2.762f, 1.846f)
                curveToRelative(-0.189f, 0.165f, -0.424f, 0.246f, -0.657f, 0.246f)
                curveToRelative(-0.279f, 0.0f, -0.557f, -0.116f, -0.754f, -0.343f)
                curveToRelative(-0.363f, -0.416f, -0.319f, -1.048f, 0.097f, -1.411f)
                curveToRelative(0.066f, -0.057f, 1.626f, -1.41f, 3.238f, -2.154f)
                curveToRelative(0.501f, -0.229f, 1.096f, -0.013f, 1.327f, 0.489f)
                curveToRelative(0.231f, 0.501f, 0.013f, 1.096f, -0.489f, 1.327f)
                close()
                moveTo(18.754f, 10.656f)
                curveToRelative(-0.198f, 0.228f, -0.475f, 0.344f, -0.754f, 0.344f)
                curveToRelative(-0.233f, 0.0f, -0.467f, -0.081f, -0.656f, -0.246f)
                curveToRelative(-0.014f, -0.012f, -1.415f, -1.224f, -2.762f, -1.846f)
                curveToRelative(-0.501f, -0.231f, -0.72f, -0.826f, -0.489f, -1.327f)
                curveToRelative(0.231f, -0.502f, 0.827f, -0.72f, 1.327f, -0.489f)
                curveToRelative(1.612f, 0.744f, 3.172f, 2.098f, 3.238f, 2.154f)
                curveToRelative(0.416f, 0.363f, 0.459f, 0.994f, 0.097f, 1.41f)
                close()
            }
        }
        .build()
        return _faceDrooling!!
    }

private var _faceDrooling: ImageVector? = null
