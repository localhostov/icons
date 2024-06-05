package me.localx.icons.straight.bold

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

public val Icons.Bold.HandMiddleFinger: ImageVector
    get() {
        if (_handMiddleFinger != null) {
            return _handMiddleFinger!!
        }
        _handMiddleFinger = Builder(name = "HandMiddleFinger", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 9.271f)
                verticalLineToRelative(-5.271f)
                curveToRelative(0.0f, -1.128f, -0.479f, -2.209f, -1.316f, -2.966f)
                curveTo(14.847f, 0.277f, 13.725f, -0.093f, 12.593f, 0.021f)
                curveToRelative(-2.015f, 0.201f, -3.593f, 2.012f, -3.593f, 4.122f)
                verticalLineToRelative(3.863f)
                curveToRelative(-0.602f, 0.131f, -1.169f, 0.409f, -1.65f, 0.817f)
                curveToRelative(-0.389f, 0.33f, -0.703f, 0.728f, -0.93f, 1.17f)
                lineToRelative(-4.397f, 4.397f)
                curveToRelative(-1.313f, 1.313f, -1.313f, 3.45f, 0.0f, 4.763f)
                lineToRelative(4.856f, 4.857f)
                lineToRelative(15.121f, -0.011f)
                verticalLineToRelative(-13.729f)
                lineToRelative(-5.0f, -1.0f)
                close()
                moveTo(19.0f, 21.001f)
                lineToRelative(-10.879f, 0.008f)
                lineToRelative(-3.978f, -3.977f)
                curveToRelative(-0.144f, -0.144f, -0.144f, -0.377f, 0.0f, -0.521f)
                lineToRelative(1.856f, -1.856f)
                verticalLineToRelative(2.345f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.265f)
                curveToRelative(0.0f, -0.33f, 0.181f, -0.532f, 0.289f, -0.623f)
                curveToRelative(0.106f, -0.091f, 0.333f, -0.235f, 0.662f, -0.183f)
                lineToRelative(2.049f, 0.34f)
                verticalLineToRelative(-7.127f)
                curveToRelative(0.0f, -0.578f, 0.399f, -1.088f, 0.892f, -1.137f)
                curveToRelative(0.389f, -0.042f, 0.656f, 0.141f, 0.779f, 0.252f)
                curveToRelative(0.212f, 0.192f, 0.329f, 0.456f, 0.329f, 0.742f)
                verticalLineToRelative(7.729f)
                lineToRelative(5.0f, 1.0f)
                verticalLineToRelative(8.271f)
                close()
            }
        }
        .build()
        return _handMiddleFinger!!
    }

private var _handMiddleFinger: ImageVector? = null
