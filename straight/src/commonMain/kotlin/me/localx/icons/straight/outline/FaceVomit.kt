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

public val Icons.Outline.FaceVomit: ImageVector
    get() {
        if (_faceVomit != null) {
            return _faceVomit!!
        }
        _faceVomit = Builder(name = "FaceVomit", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 3.075f, -1.173f, 5.874f, -3.081f, 8.0f)
                horizontalLineToRelative(-2.919f)
                verticalLineToRelative(-0.019f)
                curveToRelative(2.423f, -1.827f, 4.0f, -4.719f, 4.0f, -7.981f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.0f, 1.44f, 0.322f, 2.801f, 0.874f, 4.038f)
                curveToRelative(-0.125f, -0.013f, -0.246f, -0.038f, -0.374f, -0.038f)
                curveToRelative(-0.597f, 0.0f, -1.151f, 0.164f, -1.643f, 0.427f)
                curveToRelative(-0.55f, -1.37f, -0.857f, -2.862f, -0.857f, -4.427f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(16.375f, 6.219f)
                lineToRelative(-3.476f, 2.781f)
                lineToRelative(3.476f, 2.781f)
                lineToRelative(1.249f, -1.562f)
                lineToRelative(-1.524f, -1.219f)
                lineToRelative(1.524f, -1.219f)
                lineToRelative(-1.249f, -1.562f)
                close()
                moveTo(7.625f, 11.781f)
                lineToRelative(3.476f, -2.781f)
                lineToRelative(-3.476f, -2.781f)
                lineToRelative(-1.249f, 1.562f)
                lineToRelative(1.524f, 1.219f)
                lineToRelative(-1.524f, 1.219f)
                lineToRelative(1.249f, 1.562f)
                close()
                moveTo(18.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-3.369f)
                curveToRelative(-0.775f, 0.566f, -1.282f, 1.065f, -1.294f, 1.077f)
                lineToRelative(-1.413f, -1.415f)
                curveToRelative(0.134f, -0.135f, 3.332f, -3.293f, 6.707f, -3.293f)
                reflectiveCurveToRelative(6.573f, 3.158f, 6.707f, 3.293f)
                lineToRelative(-1.413f, 1.415f)
                curveToRelative(-0.012f, -0.012f, -0.519f, -0.51f, -1.294f, -1.077f)
                verticalLineToRelative(3.369f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(14.537f, 22.0f)
                curveToRelative(-0.341f, -0.589f, -0.537f, -1.272f, -0.537f, -2.0f)
                verticalLineToRelative(-4.537f)
                curveToRelative(-0.644f, -0.276f, -1.328f, -0.463f, -2.0f, -0.463f)
                reflectiveCurveToRelative(-1.356f, 0.187f, -2.0f, 0.463f)
                verticalLineToRelative(4.537f)
                curveToRelative(0.0f, 0.728f, -0.195f, 1.411f, -0.537f, 2.0f)
                horizontalLineToRelative(5.073f)
                close()
                moveTo(2.5f, 18.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _faceVomit!!
    }

private var _faceVomit: ImageVector? = null
