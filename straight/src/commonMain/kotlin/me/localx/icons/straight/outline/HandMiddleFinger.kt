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

public val Icons.Outline.HandMiddleFinger: ImageVector
    get() {
        if (_handMiddleFinger != null) {
            return _handMiddleFinger!!
        }
        _handMiddleFinger = Builder(name = "HandMiddleFinger", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 9.114f)
                lineTo(16.0f, 3.107f)
                curveToRelative(0.0f, -1.516f, -1.076f, -2.834f, -2.504f, -3.066f)
                curveToRelative(-0.88f, -0.143f, -1.767f, 0.103f, -2.439f, 0.674f)
                curveToRelative(-0.672f, 0.571f, -1.057f, 1.404f, -1.057f, 2.286f)
                verticalLineToRelative(5.07f)
                lineToRelative(-0.139f, -0.024f)
                curveToRelative(-0.966f, -0.159f, -1.942f, 0.109f, -2.688f, 0.741f)
                curveToRelative(-0.683f, 0.578f, -1.099f, 1.401f, -1.164f, 2.286f)
                lineTo(1.879f, 15.136f)
                curveToRelative(-0.566f, 0.567f, -0.879f, 1.32f, -0.879f, 2.122f)
                reflectiveCurveToRelative(0.312f, 1.555f, 0.918f, 2.159f)
                lineToRelative(5.113f, 4.584f)
                horizontalLineToRelative(14.969f)
                verticalLineToRelative(-13.841f)
                lineToRelative(-6.0f, -1.045f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(7.797f, 22.0f)
                lineToRelative(-4.504f, -4.036f)
                curveToRelative(-0.189f, -0.188f, -0.293f, -0.439f, -0.293f, -0.707f)
                reflectiveCurveToRelative(0.104f, -0.518f, 0.287f, -0.701f)
                lineToRelative(2.713f, -2.669f)
                verticalLineToRelative(3.113f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.683f)
                curveToRelative(0.0f, -0.388f, 0.17f, -0.754f, 0.466f, -1.005f)
                curveToRelative(0.295f, -0.25f, 0.685f, -0.358f, 1.061f, -0.295f)
                lineToRelative(2.474f, 0.43f)
                lineTo(12.001f, 3.0f)
                curveToRelative(0.0f, -0.294f, 0.129f, -0.572f, 0.353f, -0.762f)
                curveToRelative(0.228f, -0.194f, 0.52f, -0.273f, 0.822f, -0.224f)
                curveToRelative(0.463f, 0.076f, 0.825f, 0.556f, 0.825f, 1.093f)
                verticalLineToRelative(7.689f)
                lineToRelative(6.0f, 1.045f)
                verticalLineToRelative(10.159f)
                close()
            }
        }
        .build()
        return _handMiddleFinger!!
    }

private var _handMiddleFinger: ImageVector? = null
