package me.localx.icons.straight.outline

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

public val Icons.Outline.AirplaneJourney: ImageVector
    get() {
        if (_airplaneJourney != null) {
            return _airplaneJourney!!
        }
        _airplaneJourney = Builder(name = "AirplaneJourney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 11.994f)
                lineToRelative(3.535f, -3.458f)
                curveToRelative(1.95f, -1.95f, 1.95f, -5.122f, 0.0f, -7.071f)
                curveToRelative(-0.944f, -0.944f, -2.2f, -1.464f, -3.535f, -1.464f)
                reflectiveCurveToRelative(-2.591f, 0.52f, -3.536f, 1.464f)
                curveToRelative(-1.949f, 1.95f, -1.949f, 5.122f, 0.008f, 7.079f)
                lineToRelative(3.528f, 3.45f)
                close()
                moveTo(16.878f, 2.879f)
                curveToRelative(0.567f, -0.567f, 1.32f, -0.879f, 2.122f, -0.879f)
                reflectiveCurveToRelative(1.555f, 0.312f, 2.121f, 0.878f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.073f, 0.008f, 4.235f)
                lineToRelative(-2.129f, 2.082f)
                lineToRelative(-2.122f, -2.074f)
                curveToRelative(-1.169f, -1.17f, -1.169f, -3.073f, 0.0f, -4.243f)
                close()
                moveTo(9.0f, 20.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(-1.911f, 2.421f)
                curveToRelative(-0.195f, 0.357f, -0.569f, 0.579f, -0.975f, 0.579f)
                horizontalLineToRelative(-1.113f)
                lineToRelative(1.167f, -3.0f)
                lineTo(1.65f, 21.0f)
                lineToRelative(-1.546f, -1.833f)
                curveToRelative(-0.297f, -0.52f, 0.078f, -1.167f, 0.677f, -1.167f)
                curveToRelative(0.207f, 0.0f, 0.405f, 0.082f, 0.551f, 0.228f)
                lineToRelative(1.11f, 0.772f)
                horizontalLineToRelative(1.241f)
                lineToRelative(-1.184f, -3.0f)
                horizontalLineToRelative(1.096f)
                curveToRelative(0.407f, 0.0f, 0.781f, 0.222f, 0.975f, 0.579f)
                lineToRelative(1.929f, 2.421f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.802f, 0.0f, 1.25f, 0.448f, 1.25f, 1.0f)
                close()
                moveTo(24.0f, 17.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.354f, -0.061f, -0.69f, -0.172f, -1.0f)
                horizontalLineToRelative(9.172f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(3.299f)
                curveToRelative(0.208f, 0.702f, 0.529f, 1.378f, 0.961f, 2.0f)
                horizontalLineToRelative(-4.26f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.001f, 4.787f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
        }
        .build()
        return _airplaneJourney!!
    }

private var _airplaneJourney: ImageVector? = null
