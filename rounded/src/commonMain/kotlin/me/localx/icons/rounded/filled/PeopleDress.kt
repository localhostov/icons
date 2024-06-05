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

public val Icons.Filled.PeopleDress: ImageVector
    get() {
        if (_peopleDress != null) {
            return _peopleDress!!
        }
        _peopleDress = Builder(name = "PeopleDress", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.52f, 2.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(10.12f, 9.62f)
                curveToRelative(-0.26f, -2.06f, -2.02f, -3.62f, -4.1f, -3.62f)
                reflectiveCurveToRelative(-3.84f, 1.56f, -4.1f, 3.62f)
                lineToRelative(-0.88f, 7.01f)
                curveToRelative(-0.11f, 0.85f, 0.16f, 1.71f, 0.73f, 2.36f)
                curveToRelative(0.34f, 0.39f, 0.77f, 0.67f, 1.25f, 0.84f)
                verticalLineToRelative(3.17f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.17f)
                curveToRelative(0.48f, -0.17f, 0.91f, -0.46f, 1.25f, -0.84f)
                curveToRelative(0.57f, -0.64f, 0.83f, -1.5f, 0.73f, -2.36f)
                lineToRelative(-0.88f, -7.01f)
                close()
                moveTo(18.0f, 5.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(22.98f, 16.63f)
                lineToRelative(-0.88f, -7.01f)
                curveToRelative(-0.26f, -2.06f, -2.02f, -3.62f, -4.1f, -3.62f)
                reflectiveCurveToRelative(-3.84f, 1.56f, -4.1f, 3.62f)
                lineToRelative(-0.88f, 7.01f)
                curveToRelative(-0.11f, 0.85f, 0.16f, 1.71f, 0.73f, 2.36f)
                curveToRelative(0.34f, 0.39f, 0.77f, 0.67f, 1.25f, 0.84f)
                verticalLineToRelative(3.17f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.17f)
                curveToRelative(0.48f, -0.17f, 0.91f, -0.46f, 1.25f, -0.84f)
                curveToRelative(0.57f, -0.65f, 0.83f, -1.5f, 0.73f, -2.36f)
                close()
            }
        }
        .build()
        return _peopleDress!!
    }

private var _peopleDress: ImageVector? = null
