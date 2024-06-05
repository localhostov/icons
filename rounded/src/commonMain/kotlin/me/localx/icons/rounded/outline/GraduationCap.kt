package me.localx.icons.rounded.outline

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

public val Icons.Outline.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(470.549f, 111.573f)
                lineTo(313.237f, 36.629f)
                curveToRelative(-34.628f, -20.684f, -77.728f, -21.051f, -112.704f, -0.96f)
                lineTo(41.451f, 111.573f)
                curveToRelative(-0.597f, 0.299f, -1.216f, 0.619f, -1.792f, 0.96f)
                curveToRelative(-37.752f, 21.586f, -50.858f, 69.689f, -29.272f, 107.441f)
                curveToRelative(7.317f, 12.798f, 18.08f, 23.284f, 31.064f, 30.266f)
                lineToRelative(43.883f, 20.907f)
                verticalLineTo(375.68f)
                curveToRelative(0.026f, 46.743f, 30.441f, 88.039f, 75.072f, 101.931f)
                curveToRelative(31.059f, 8.985f, 63.264f, 13.384f, 95.595f, 13.056f)
                curveToRelative(32.326f, 0.362f, 64.531f, -4.0f, 95.595f, -12.949f)
                curveToRelative(44.631f, -13.891f, 75.046f, -55.188f, 75.072f, -101.931f)
                verticalLineTo(271.104f)
                lineToRelative(42.667f, -20.395f)
                verticalLineToRelative(175.957f)
                curveToRelative(0.0f, 11.782f, 9.551f, 21.333f, 21.333f, 21.333f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                verticalLineToRelative(-256.0f)
                curveTo(512.143f, 145.615f, 492.363f, 122.473f, 470.549f, 111.573f)
                close()
                moveTo(384.0f, 375.787f)
                curveToRelative(0.011f, 27.959f, -18.129f, 52.69f, -44.8f, 61.077f)
                curveToRelative(-27.046f, 7.728f, -55.073f, 11.479f, -83.2f, 11.136f)
                curveToRelative(-28.127f, 0.343f, -56.154f, -3.408f, -83.2f, -11.136f)
                curveToRelative(-26.671f, -8.388f, -44.811f, -33.118f, -44.8f, -61.077f)
                verticalLineToRelative(-84.309f)
                lineToRelative(70.763f, 33.707f)
                curveToRelative(17.46f, 10.368f, 37.401f, 15.816f, 57.707f, 15.765f)
                curveToRelative(19.328f, 0.137f, 38.331f, -4.98f, 54.976f, -14.805f)
                lineTo(384.0f, 291.477f)
                verticalLineTo(375.787f)
                close()
                moveTo(452.267f, 211.733f)
                lineToRelative(-160.896f, 76.8f)
                curveToRelative(-22.434f, 13.063f, -50.241f, 12.693f, -72.32f, -0.96f)
                lineToRelative(-157.419f, -74.88f)
                curveToRelative(-17.547f, -9.462f, -24.101f, -31.357f, -14.639f, -48.903f)
                curveToRelative(3.2f, -5.934f, 7.998f, -10.853f, 13.85f, -14.201f)
                lineToRelative(159.893f, -76.373f)
                curveToRelative(22.441f, -13.034f, 50.233f, -12.665f, 72.32f, 0.96f)
                lineToRelative(157.312f, 74.944f)
                curveToRelative(11.569f, 6.424f, 18.807f, 18.555f, 18.965f, 31.787f)
                curveTo(469.354f, 193.441f, 462.9f, 205.097f, 452.267f, 211.733f)
                lineTo(452.267f, 211.733f)
                close()
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
