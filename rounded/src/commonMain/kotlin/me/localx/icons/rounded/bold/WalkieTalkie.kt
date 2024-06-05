package me.localx.icons.rounded.bold

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

public val Icons.Bold.WalkieTalkie: ImageVector
    get() {
        if (_walkieTalkie != null) {
            return _walkieTalkie!!
        }
        _walkieTalkie = Builder(name = "WalkieTalkie", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.5f, 3.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(1.757f)
                curveToRelative(-1.746f, 0.619f, -3.0f, 2.287f, -3.0f, 4.243f)
                verticalLineToRelative(4.597f)
                curveToRelative(0.0f, 1.244f, 0.428f, 2.464f, 1.205f, 3.436f)
                lineToRelative(0.685f, 0.856f)
                curveToRelative(0.071f, 0.088f, 0.11f, 0.199f, 0.11f, 0.312f)
                verticalLineToRelative(1.798f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-1.798f)
                curveToRelative(0.0f, -0.113f, 0.039f, -0.224f, 0.11f, -0.312f)
                lineToRelative(0.685f, -0.856f)
                curveToRelative(0.777f, -0.972f, 1.205f, -2.192f, 1.205f, -3.436f)
                verticalLineToRelative(-4.597f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(19.0f, 12.097f)
                curveToRelative(0.0f, 0.565f, -0.195f, 1.12f, -0.548f, 1.562f)
                lineToRelative(-0.685f, 0.856f)
                curveToRelative(-0.495f, 0.618f, -0.767f, 1.395f, -0.767f, 2.187f)
                verticalLineToRelative(1.798f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-1.798f)
                curveToRelative(0.0f, -0.792f, -0.272f, -1.568f, -0.767f, -2.187f)
                lineToRelative(-0.685f, -0.856f)
                curveToRelative(-0.353f, -0.442f, -0.548f, -0.997f, -0.548f, -1.562f)
                verticalLineToRelative(-4.597f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(4.597f)
                close()
                moveTo(17.0f, 9.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _walkieTalkie!!
    }

private var _walkieTalkie: ImageVector? = null
