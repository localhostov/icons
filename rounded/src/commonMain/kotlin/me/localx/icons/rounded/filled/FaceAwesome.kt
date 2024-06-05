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

public val Icons.Filled.FaceAwesome: ImageVector
    get() {
        if (_faceAwesome != null) {
            return _faceAwesome!!
        }
        _faceAwesome = Builder(name = "FaceAwesome", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.96f, 17.86f)
                reflectiveCurveToRelative(0.02f, 0.0f, 0.04f, 0.0f)
                curveToRelative(1.99f, 0.0f, 3.72f, -1.08f, 4.67f, -2.67f)
                curveToRelative(-0.32f, -0.04f, -0.66f, -0.05f, -1.04f, -0.05f)
                curveToRelative(-1.73f, 0.0f, -3.18f, 1.15f, -3.67f, 2.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.38f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.38f, 12.0f, -12.0f)
                reflectiveCurveTo(18.62f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(5.0f, 9.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-0.65f)
                curveToRelative(-0.15f, 0.09f, -0.31f, 0.15f, -0.5f, 0.15f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.15f, 0.04f, -0.28f, 0.09f, -0.41f)
                curveToRelative(-0.35f, 0.16f, -0.59f, 0.5f, -0.59f, 0.91f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(18.97f, 14.45f)
                curveToRelative(-0.88f, 3.02f, -3.66f, 5.22f, -6.97f, 5.22f)
                reflectiveCurveToRelative(-6.08f, -2.21f, -6.97f, -5.22f)
                curveToRelative(-0.17f, -0.57f, 0.29f, -1.13f, 0.88f, -1.13f)
                horizontalLineToRelative(12.17f)
                curveToRelative(0.59f, 0.0f, 1.05f, 0.56f, 0.88f, 1.13f)
                close()
                moveTo(19.0f, 10.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-0.65f)
                curveToRelative(-0.15f, 0.09f, -0.31f, 0.15f, -0.5f, 0.15f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.15f, 0.04f, -0.28f, 0.09f, -0.41f)
                curveToRelative(-0.35f, 0.16f, -0.59f, 0.5f, -0.59f, 0.91f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _faceAwesome!!
    }

private var _faceAwesome: ImageVector? = null
