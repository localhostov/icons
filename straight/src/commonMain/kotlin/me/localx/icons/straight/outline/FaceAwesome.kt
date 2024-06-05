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

public val Icons.Outline.FaceAwesome: ImageVector
    get() {
        if (_faceAwesome != null) {
            return _faceAwesome!!
        }
        _faceAwesome = Builder(name = "FaceAwesome", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.38f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.38f, 12.0f, -12.0f)
                reflectiveCurveTo(18.62f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.51f, 0.0f, -10.0f, -4.49f, -10.0f, -10.0f)
                reflectiveCurveTo(6.49f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.49f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.49f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(7.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.05f)
                curveToRelative(-0.08f, 0.02f, -0.16f, 0.05f, -0.25f, 0.05f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                curveToRelative(0.0f, -0.04f, 0.02f, -0.07f, 0.02f, -0.11f)
                curveToRelative(-0.31f, 0.17f, -0.52f, 0.49f, -0.52f, 0.86f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(19.0f, 9.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.05f)
                curveToRelative(-0.08f, 0.02f, -0.16f, 0.05f, -0.25f, 0.05f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                curveToRelative(0.0f, -0.04f, 0.02f, -0.07f, 0.02f, -0.11f)
                curveToRelative(-0.31f, 0.17f, -0.52f, 0.49f, -0.52f, 0.86f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f)
                close()
                moveTo(12.0f, 19.09f)
                curveToRelative(3.6f, 0.0f, 6.56f, -2.7f, 7.0f, -6.18f)
                lineTo(5.0f, 12.91f)
                curveToRelative(0.44f, 3.48f, 3.4f, 6.18f, 7.0f, 6.18f)
                close()
                moveTo(15.53f, 14.68f)
                curveToRelative(0.37f, 0.0f, 0.71f, 0.0f, 1.01f, 0.05f)
                curveToRelative(-0.92f, 1.55f, -2.61f, 2.6f, -4.54f, 2.6f)
                curveToRelative(-0.01f, 0.0f, -0.02f, 0.0f, -0.04f, 0.0f)
                curveToRelative(0.47f, -1.53f, 1.88f, -2.65f, 3.57f, -2.65f)
                close()
            }
        }
        .build()
        return _faceAwesome!!
    }

private var _faceAwesome: ImageVector? = null
